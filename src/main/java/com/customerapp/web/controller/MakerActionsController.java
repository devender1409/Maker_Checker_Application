package com.customerapp.web.controller;

import com.customerapp.model.hibernate.repository.entities.UserEntity;
import com.customerapp.model.hibernate.service.formbeans.CustomerFormBean;
import com.customerapp.model.hibernate.service.interfaces.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/maker.do")
public class MakerActionsController {
    private final CustomerService customerService;
    private static final String home = "redirect:home";
    @Autowired
    public MakerActionsController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "/home")
    public String showAll(ModelMap mv){
        List<CustomerFormBean> tmpList = customerService.getAllCustomersFromTempTable();
        List<CustomerFormBean> mstList = customerService.getAllCustomersFromMstTable();
        tmpList.addAll(mstList);
        mv.addAttribute("customers",tmpList);
        return "makerpage";
    }

    @GetMapping(path = "addcustomer")
    public String addCustomerGet(ModelMap modelMap){
        CustomerFormBean customer=new CustomerFormBean();//form bean
        modelMap.addAttribute("customer",customer );
        return "addcustomer";
    }

    @PostMapping(path = "addcustomer")
    public String addCustomerPost(HttpSession session,ModelMap modelMap, @Valid @ModelAttribute(name = "customer")  CustomerFormBean customer, BindingResult bindingResult){

        if(bindingResult.hasErrors()) return "addcustomer";
        if(customerService.getCustomerFromTempTable(customer.getCustomerCode())!=null){
            modelMap.addAttribute("customerCode",customer.getCustomerCode());
            modelMap.addAttribute("recordStatus","N");
            return "already";
        }
        if(customerService.getCustomerFromMstTable(customer.getCustomerCode())!=null){
            modelMap.addAttribute("customerCode",customer.getCustomerCode());
            modelMap.addAttribute("recordStatus","A");
            return "already";
        }

        UserEntity user = (UserEntity) session.getAttribute("user");

        customer.setCustomerId(1);
        customer.setCreatedBy(user.getName());
        customer.setCreatedDate(new Date());
        customer.setRecordStatus("N");
        customerService.addCustomerInTempTable(customer);

        return home;
    }


    @GetMapping(path = "update")
    public String udpateCustomerGet(HttpSession session , ModelMap modelMap, @RequestParam(name="id") String customerCode, @RequestParam(name = "status")String recordStatus){
        CustomerFormBean customer;
        if(recordStatus.equals("A")){
            customer= customerService.getCustomerFromMstTable(customerCode);
        }else{
            customer = customerService.getCustomerFromTempTable(customerCode);
        }
        modelMap.addAttribute("customer",customer);
        return "updatecustomer";
    }

    @PostMapping(path = "update")
    public String updateCustomerPost(HttpSession session, @Valid @ModelAttribute(name = "customer")  CustomerFormBean customer,BindingResult bindingResult){
        if(bindingResult.hasErrors()) return "updatecustomer";

        UserEntity user = (UserEntity) session.getAttribute("user");
        CustomerFormBean temp = customerService.getCustomerFromTempTable(customer.getCustomerCode());

        System.out.println("deleted customer--> "+temp);
        System.out.println("customer raw -> " + customer);

        if(customer.getRecordStatus().equals("N")){

            customer.setCreatedBy(temp.getCreatedBy());
            customer.setCreatedDate(temp.getCreatedDate());
            customer.setModifiedDate(new Date());
            customer.setModifiedBy(user.getName());
            customer.setRecordStatus("N");
            customerService.modifyCustomerInTempTable(customer.getCustomerCode(),customer);
        }else if(customer.getRecordStatus().equals("M")){
            customer.setCreatedBy(temp.getCreatedBy());
            customer.setCreatedDate(temp.getCreatedDate());
            customer.setModifiedDate(new Date());
            customer.setModifiedBy(user.getName());
            customer.setRecordStatus("N");
            customerService.modifyCustomerInTempTable(customer.getCustomerCode(),customer);
        }else if(customer.getRecordStatus().equals("A")){
            CustomerFormBean mstTemp = customerService.getCustomerFromMstTable(customer.getCustomerCode());
            customer.setRecordStatus("M");
            customer.setCreatedBy(mstTemp.getCreatedBy());
            customer.setCreatedDate(mstTemp.getCreatedDate());
            customer.setModifiedDate(new Date());
            customer.setModifiedBy(user.getName());
            customerService.addCustomerInTempTable(customer);
        }else{

        }

        return home;
    }


    @GetMapping(path = "view")
    public String viewCustomerGet(HttpSession session ,ModelMap modelMap, @RequestParam(name="id") String customerCode,@RequestParam(name = "status") String recordStatus){
        CustomerFormBean customer;
        if(recordStatus.equals("A")){
            customer= customerService.getCustomerFromMstTable(customerCode);
        }else{
            customer = customerService.getCustomerFromTempTable(customerCode);
        }
        modelMap.addAttribute("customer",customer);
        return "customerpage";
    }


    @GetMapping(path = "delete")
    public String deleteCustomerGet(HttpSession session , @RequestParam(name="id") String customerCode,@RequestParam(name="status") String recordStatus){
        UserEntity user = (UserEntity) session.getAttribute("user");

        if(customerService.getCustomerFromTempTable(customerCode)!=null){
            customerService.deleteCustomerFromTempTable(customerCode);
        }

        if(recordStatus.equals("A")){
            CustomerFormBean customer= customerService.getCustomerFromMstTable(customerCode);
            customer.setModifiedBy(user.getName());
            customer.setModifiedDate(new Date());
            customer.setRecordStatus("D");
            customerService.addCustomerInTempTable(customer);
        }else{
//            customerService.deleteCustomerFromTempTable(customerCode);
        }

        return home;
    }

}
