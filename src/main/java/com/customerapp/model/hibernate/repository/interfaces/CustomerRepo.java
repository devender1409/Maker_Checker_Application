package com.customerapp.model.hibernate.repository.interfaces;

import com.customerapp.model.hibernate.repository.entities.CustomerMstEntity;
import com.customerapp.model.hibernate.repository.entities.CustomerTempEntity;

import java.util.List;

public interface CustomerRepo {
    void addCustomerInTempTable(CustomerTempEntity customer);
    void addCustomerInMstTable(CustomerMstEntity customer);

    void deleteCustomerFromTempTable(String customerCode);
    void deleteCustomerFromMstTable(String customerCode);

    void modifyCustomerInTempTable(String customerCode,CustomerTempEntity customer);
    void modifyCustomerInMstTable(String customerCode,CustomerMstEntity customer);

    CustomerTempEntity getCustomerFromTempTable(String customerCode);
    CustomerMstEntity getCustomerFromMstTable(String customerCode);

    List<CustomerTempEntity> getAllCustomersFromTempTable();
    List<CustomerMstEntity> getAllCustomersFromMstTable();

}
