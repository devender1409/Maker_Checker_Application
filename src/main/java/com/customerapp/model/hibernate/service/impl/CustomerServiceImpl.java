package com.customerapp.model.hibernate.service.impl;

import com.customerapp.model.hibernate.repository.entities.CustomerMstEntity;
import com.customerapp.model.hibernate.repository.entities.CustomerTempEntity;
import com.customerapp.model.hibernate.repository.interfaces.CustomerRepo;
import com.customerapp.model.hibernate.service.entity2formbeans.CustomerMstEntityToCustomerFormBean;
import com.customerapp.model.hibernate.service.entity2formbeans.CustomerTempEntityToCustomerFormBean;
import com.customerapp.model.hibernate.service.formbean2entity.CustomerFormBeanToCustomerMstEntity;
import com.customerapp.model.hibernate.service.formbean2entity.CustomerFormBeanToCustomerTempEntity;
import com.customerapp.model.hibernate.service.formbeans.CustomerFormBean;
import com.customerapp.model.hibernate.service.interfaces.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@EnableTransactionManagement
@Service(value = "customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public void addCustomerInTempTable(CustomerFormBean customerFormBean) {
        CustomerTempEntity customer = CustomerFormBeanToCustomerTempEntity.parse(customerFormBean);
        customerRepo.addCustomerInTempTable(customer);
    }

    @Override
    public void addCustomerInMstTable(CustomerFormBean customerFormBean) {
        CustomerMstEntity customer = CustomerFormBeanToCustomerMstEntity.parse(customerFormBean);
        customerRepo.addCustomerInMstTable(customer);
    }

    @Override
    public CustomerFormBean deleteCustomerFromTempTable(String customerCode) {
        CustomerTempEntity customer= customerRepo.getCustomerFromTempTable(customerCode);
        customerRepo.deleteCustomerFromTempTable(customerCode);
        return CustomerTempEntityToCustomerFormBean.parse(customer);
    }

    @Override
    public CustomerFormBean deleteCustomerFromMstTable(String customerCode) {
        CustomerMstEntity customer = customerRepo.getCustomerFromMstTable(customerCode);
        customerRepo.deleteCustomerFromMstTable(customerCode);
        return CustomerMstEntityToCustomerFormBean.parse(customer);
    }

    @Override
    public void modifyCustomerInTempTable(String customerCode, CustomerFormBean customerFormBean) {
        CustomerTempEntity customer = CustomerFormBeanToCustomerTempEntity.parse(customerFormBean);
        customerRepo.modifyCustomerInTempTable(customerCode,customer);
    }

    @Override
    public void modifyCustomerInMstTable(String customerCode, CustomerFormBean customerFormBean) {
        CustomerMstEntity customer = CustomerFormBeanToCustomerMstEntity.parse(customerFormBean);
        customerRepo.modifyCustomerInMstTable(customerCode,customer);
    }

    @Override
    public CustomerFormBean getCustomerFromTempTable(String customerCode) {
        CustomerTempEntity customer = customerRepo.getCustomerFromTempTable(customerCode);
        if(customer==null) return null;
        return CustomerTempEntityToCustomerFormBean.parse(customer);
    }

    @Override
    public CustomerFormBean getCustomerFromMstTable(String customerCode) {
        CustomerMstEntity customer = customerRepo.getCustomerFromMstTable(customerCode);
        if(customer==null) return null;
        return CustomerMstEntityToCustomerFormBean.parse(customer);
    }

    @Override
    public List<CustomerFormBean> getAllCustomersFromTempTable() {
        List<CustomerTempEntity> customerTempEntityList = customerRepo.getAllCustomersFromTempTable();

        List<CustomerFormBean> customerFormBeanList = new ArrayList<>();
        for(CustomerTempEntity customer : customerTempEntityList){
            CustomerFormBean customerFormBean = CustomerTempEntityToCustomerFormBean.parse(customer);
            customerFormBeanList.add(customerFormBean);
        }
        return customerFormBeanList;
    }

    @Override
    public List<CustomerFormBean> getAllCustomersFromMstTable() {
        List<CustomerMstEntity> customerMstEntityList = customerRepo.getAllCustomersFromMstTable();

        List<CustomerFormBean> customerFormBeanList = new ArrayList<>();

        for (CustomerMstEntity customer : customerMstEntityList){
            CustomerFormBean customerFormBean = CustomerMstEntityToCustomerFormBean.parse(customer);
            customerFormBeanList.add(customerFormBean);
        }
        return customerFormBeanList;
    }
}
