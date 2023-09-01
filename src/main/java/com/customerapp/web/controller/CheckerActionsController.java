package com.customerapp.web.controller;

import com.customerapp.model.hibernate.repository.entities.UserEntity;
import com.customerapp.model.hibernate.service.formbeans.CustomerFormBean;
import com.customerapp.model.hibernate.service.interfaces.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping(path = "/checker.do")
public class CheckerActionsController {
    private final CustomerService customerService;

    @Autowired
    public CheckerActionsController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "/home")
    public String showAll(ModelMap mv){
        List<CustomerFormBean> allCustomersFromTempTable = customerService.getAllCustomersFromTempTable();
        List<CustomerFormBean> customerWithStatusNMD = allCustomersFromTempTable
                .stream()
                .filter(c -> c.getRecordStatus().equals("N")|| c.getRecordStatus().equals("M") ||c.getRecordStatus().equals("D"))
                .collect(Collectors.toList());
        mv.addAttribute("customers",customerWithStatusNMD);
        return "checkerpage";
    }


    @GetMapping(path = "/approve")
    public String approve(HttpSession session , @RequestParam(name="id") String customerCode){
        UserEntity user = (UserEntity) session.getAttribute("user");//current user

        CustomerFormBean customerToBeApprove = customerService.deleteCustomerFromTempTable(customerCode);
        System.out.println("raw approve--> "+customerToBeApprove);



        if(customerToBeApprove.getRecordStatus().equals("N")){//if new customer - > add
            customerToBeApprove.setAuthorizedBy(user.getName());
            customerToBeApprove.setAuthorizedDate(new Date());
            customerToBeApprove.setRecordStatus("A");
            if(customerService.getCustomerFromMstTable(customerCode)==null){
                customerService.addCustomerInMstTable(customerToBeApprove);
            }else{
                customerService.modifyCustomerInMstTable(customerCode,customerToBeApprove);
            }

        }else if(customerToBeApprove.getRecordStatus().equals("M")){
            customerToBeApprove.setAuthorizedBy(user.getName());
            customerToBeApprove.setAuthorizedDate(new Date());
            customerToBeApprove.setRecordStatus("A");

            customerService.modifyCustomerInMstTable(customerCode,customerToBeApprove);

        } else if (customerToBeApprove.getRecordStatus().equals("D")) {
            if(customerService.getCustomerFromMstTable(customerCode)==null){
                customerService.deleteCustomerFromMstTable(customerCode);
            }
        }
        return "redirect:home";
    }

    @GetMapping(path = "/reject")
    public String reject(HttpSession session , @RequestParam(name="id") String customerCode){
        UserEntity user = (UserEntity) session.getAttribute("user");//current user

        CustomerFormBean customer = customerService.deleteCustomerFromTempTable(customerCode);

        customer.setAuthorizedBy(user.getName());
        customer.setAuthorizedDate(new Date());

        if(customer.getRecordStatus().equals("N")){//if new customer - > add
            customer.setRecordStatus("NR");
        }else if (customer.getRecordStatus().equals("M")){
            customer.setRecordStatus("MR");
        }else if (customer.getRecordStatus().equals("D")) {
            customer.setRecordStatus("DR");
        }else {
            return "404";
        }
        customerService.addCustomerInTempTable(customer);

        return "redirect:home";
    }
}
