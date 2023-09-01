package com.customerapp.model.hibernate.service.formbean2entity;

import com.customerapp.model.hibernate.repository.entities.CustomerTempEntity;
import com.customerapp.model.hibernate.service.formbeans.CustomerFormBean;

public class CustomerFormBeanToCustomerTempEntity {
    public static CustomerTempEntity parse(CustomerFormBean customerFormBean){
        CustomerTempEntity customer = new CustomerTempEntity();

        customer.setCustomerId(customerFormBean.getCustomerId());//customer id

        customer.setCustomerCode(customerFormBean.getCustomerCode());//customer code

        customer.setCustomerName(customerFormBean.getCustomerName());//customer Name

        customer.setCustomerAddress1(customerFormBean.getCustomerAddress1());//customer Address1

        customer.setCustomerAddress2(customerFormBean.getCustomerAddress2());//customer Address2

        customer.setCustomerPinCode(customerFormBean.getCustomerPinCode());//customer pincode

        customer.setEmailAddress(customerFormBean.getEmailAddress());//customer email

        customer.setContactNumber(customerFormBean.getContactNumber());//customer contact number

        customer.setPrimaryContactPerson(customerFormBean.getPrimaryContactPerson());//customer primary contact person

        customer.setRecordStatus(customerFormBean.getRecordStatus());//customer record status

        customer.setActiveInactiveFlag(customerFormBean.getActiveInactiveFlag());//customer AIFlag

        customer.setCreatedBy(customerFormBean.getCreatedBy());//created by

        customer.setCreatedDate(customerFormBean.getCreatedDate());//Creeated date

        customer.setModifiedBy(customerFormBean.getModifiedBy());//modified by
        customer.setModifiedDate(customerFormBean.getModifiedDate());//modified date
        customer.setAuthorizedBy(customerFormBean.getAuthorizedBy());//authorized by
        customer.setAuthorizedDate(customerFormBean.getAuthorizedDate());//authorized date


        return customer;
    }
}
