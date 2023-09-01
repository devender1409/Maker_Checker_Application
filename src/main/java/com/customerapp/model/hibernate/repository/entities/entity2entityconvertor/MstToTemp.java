package com.customerapp.model.hibernate.repository.entities.entity2entityconvertor;

import com.customerapp.model.hibernate.repository.entities.CustomerMstEntity;
import com.customerapp.model.hibernate.repository.entities.CustomerTempEntity;

public class MstToTemp {
    public CustomerTempEntity parse(CustomerMstEntity customerMstEntity){
        CustomerTempEntity customerTmpEntity = new CustomerTempEntity();
        customerTmpEntity.setCustomerId(customerMstEntity.getCustomerId());//customer id

        customerTmpEntity.setCustomerCode(customerMstEntity.getCustomerCode());//customer code

        customerTmpEntity.setCustomerName(customerMstEntity.getCustomerName());//customer Name

        customerTmpEntity.setCustomerAddress1(customerMstEntity.getCustomerAddress1());//customer Address1

        customerTmpEntity.setCustomerAddress2(customerMstEntity.getCustomerAddress2());//customer Address2

        customerTmpEntity.setCustomerPinCode(customerMstEntity.getCustomerPinCode());//customer pincode

        customerTmpEntity.setEmailAddress(customerMstEntity.getEmailAddress());//customer email

        customerTmpEntity.setContactNumber(customerMstEntity.getContactNumber());//customer contact number

        customerTmpEntity.setPrimaryContactPerson(customerMstEntity.getPrimaryContactPerson());//customer primary contact person

        customerTmpEntity.setRecordStatus(customerMstEntity.getRecordStatus());//customer record status

        customerTmpEntity.setActiveInactiveFlag(customerMstEntity.getActiveInactiveFlag());//customer AIFlag

        customerTmpEntity.setCreatedBy(customerMstEntity.getCreatedBy());//created by

        customerTmpEntity.setCreatedDate(customerMstEntity.getCreatedDate());//Creeated date

        customerTmpEntity.setModifiedBy(customerMstEntity.getModifiedBy());//modified by
        customerTmpEntity.setModifiedDate(customerMstEntity.getModifiedDate());//modified date
        customerTmpEntity.setAuthorizedBy(customerMstEntity.getAuthorizedBy());//authorized by
        customerTmpEntity.setAuthorizedDate(customerMstEntity.getAuthorizedDate());//authorized date


        return customerTmpEntity;
    }
}
