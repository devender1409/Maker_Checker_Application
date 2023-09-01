package com.customerapp.web;

import com.customerapp.model.hibernate.repository.entities.CustomerTempEntity;
import com.customerapp.model.hibernate.service.formbeans.CustomerFormBean;
import com.customerapp.model.hibernate.service.interfaces.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class Tester2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("model-config.xml");
        CustomerService customerService = context.getBean("customerService", CustomerService.class);

//        CustomerFormBean customerTemp = new CustomerFormBean(1,"C102","Yajas Kumar Kaim","Jungpura",110024,"yajas.kumar.kaim@nu.com","Tavisi","N","A","Pooja Sharma",new Date());
//        customerService.addCustomerInTempTable(customerTemp);
//        CustomerFormBean customerFormBean = new CustomerFormBean();
//        customerFormBean.setRecordStatus("M");
//        customerTemp.setRecordStatus("N");

//        List<CustomerFormBean> list = customerService.getAllCustomersFromTempTable();
//
//        customerService.modifyCustomerInTempTable("C101",customerTemp);

//        customerService.modifyCustomerInTempTable("C102",customerTemp);


//        CustomerFormBean customer= customerService.deleteCustomerFromTempTable("C102");
//        System.out.println(customer);
//
//
//        customer.setModifiedBy("Megha Bhardwaj Mam");
//        customer.setModifiedDate(new Date());
//        customerService.addCustomerInTempTable(customer);
//
//        System.out.println(customerMstEntity);
//        for(CustomerFormBean c : list) {
//            System.out.println(c);
//        }


//        customerService.deleteCustomerFromTempTable("C101");
//        }
    }
}
