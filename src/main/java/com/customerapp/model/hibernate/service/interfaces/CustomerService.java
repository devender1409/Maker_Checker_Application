package com.customerapp.model.hibernate.service.interfaces;

import com.customerapp.model.hibernate.service.formbeans.CustomerFormBean;

import java.util.List;

public interface CustomerService {
    void addCustomerInTempTable(CustomerFormBean customerFormBean);
    void addCustomerInMstTable(CustomerFormBean customerFormBean);

    CustomerFormBean deleteCustomerFromTempTable(String customerCode);
    CustomerFormBean deleteCustomerFromMstTable(String customerCode);

    void modifyCustomerInTempTable(String customerCode,CustomerFormBean customerFormBean);
    void modifyCustomerInMstTable(String customerCode,CustomerFormBean customerFormBean);

    CustomerFormBean getCustomerFromTempTable(String customerCode);
    CustomerFormBean getCustomerFromMstTable(String customerCode);

    List<CustomerFormBean> getAllCustomersFromTempTable();
    List<CustomerFormBean> getAllCustomersFromMstTable();
}
