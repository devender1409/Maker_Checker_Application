package com.customerapp.model.hibernate.repository.entities.entity2entityconvertor;

import com.customerapp.model.hibernate.repository.entities.CustomerMstEntity;
import com.customerapp.model.hibernate.repository.entities.CustomerTempEntity;

public class TempToMst {
    public static CustomerMstEntity parse(CustomerTempEntity customerTmpEntity){
        CustomerMstEntity customerMstEntity = new CustomerMstEntity();

        customerMstEntity.setCustomerId(customerTmpEntity.getCustomerId());//customer id

        customerMstEntity.setCustomerCode(customerTmpEntity.getCustomerCode());//customer code

        customerMstEntity.setCustomerName(customerTmpEntity.getCustomerName());//customer Name

        customerMstEntity.setCustomerAddress1(customerTmpEntity.getCustomerAddress1());//customer Address1

        customerMstEntity.setCustomerAddress2(customerTmpEntity.getCustomerAddress2());//customer Address2

        customerMstEntity.setCustomerPinCode(customerTmpEntity.getCustomerPinCode());//customer pincode

        customerMstEntity.setEmailAddress(customerTmpEntity.getEmailAddress());//customer email

        customerMstEntity.setContactNumber(customerTmpEntity.getContactNumber());//customer contact number

        customerMstEntity.setPrimaryContactPerson(customerTmpEntity.getPrimaryContactPerson());//customer primary contact person

        customerMstEntity.setRecordStatus(customerTmpEntity.getRecordStatus());//customer record status

        customerMstEntity.setActiveInactiveFlag(customerTmpEntity.getActiveInactiveFlag());//customer AIFlag

        customerMstEntity.setCreatedBy(customerTmpEntity.getCreatedBy());//created by

        customerMstEntity.setCreatedDate(customerTmpEntity.getCreatedDate());//Creeated date

        customerMstEntity.setModifiedBy(customerTmpEntity.getModifiedBy());//modified by
        customerMstEntity.setModifiedDate(customerTmpEntity.getModifiedDate());//modified date
        customerMstEntity.setAuthorizedBy(customerTmpEntity.getAuthorizedBy());//authorized by
        customerMstEntity.setAuthorizedDate(customerTmpEntity.getAuthorizedDate());//authorized date

        return customerMstEntity;
    }
}
