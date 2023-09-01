package com.customerapp.model.hibernate.service.entity2formbeans;

import com.customerapp.model.hibernate.repository.entities.CustomerTempEntity;
import com.customerapp.model.hibernate.service.formbeans.CustomerFormBean;

public class CustomerTempEntityToCustomerFormBean {
    public static CustomerFormBean parse(CustomerTempEntity customer){
        CustomerFormBean customerFormBean = new CustomerFormBean();

        customerFormBean.setCustomerId(customer.getCustomerId());//customer id

        customerFormBean.setCustomerCode(customer.getCustomerCode());//customer code

        customerFormBean.setCustomerName(customer.getCustomerName());//customer Name

        customerFormBean.setCustomerAddress1(customer.getCustomerAddress1());//customer Address1

        customerFormBean.setCustomerAddress2(customer.getCustomerAddress2());//customer Address2

        customerFormBean.setCustomerPinCode(customer.getCustomerPinCode());//customer pincode

        customerFormBean.setEmailAddress(customer.getEmailAddress());//customer email

        customerFormBean.setContactNumber(customer.getContactNumber());//customer contact number

        customerFormBean.setPrimaryContactPerson(customer.getPrimaryContactPerson());//customer primary contact person

        customerFormBean.setRecordStatus(customer.getRecordStatus());//customer record status

        customerFormBean.setActiveInactiveFlag(customer.getActiveInactiveFlag());//customer AIFlag

        customerFormBean.setCreatedBy(customer.getCreatedBy());//created by

        customerFormBean.setCreatedDate(customer.getCreatedDate());//Creeated date

        customerFormBean.setModifiedBy(customer.getModifiedBy());//modified by
        customerFormBean.setModifiedDate(customer.getModifiedDate());//modified date
        customerFormBean.setAuthorizedBy(customer.getAuthorizedBy());//authorized by
        customerFormBean.setAuthorizedDate(customer.getAuthorizedDate());//authorized date

        return customerFormBean;

    }
}
