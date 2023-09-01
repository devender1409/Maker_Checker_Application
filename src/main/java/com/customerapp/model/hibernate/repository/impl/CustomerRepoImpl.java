package com.customerapp.model.hibernate.repository.impl;

import com.customerapp.model.hibernate.repository.entities.CustomerMstEntity;
import com.customerapp.model.hibernate.repository.entities.CustomerTempEntity;
import com.customerapp.model.hibernate.repository.interfaces.CustomerRepo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepoImpl implements CustomerRepo {
    private final SessionFactory sessionFactory;

    @Autowired
    public CustomerRepoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addCustomerInTempTable(CustomerTempEntity customer) {
        getSession().persist(customer);
    }

    @Override
    public void addCustomerInMstTable(CustomerMstEntity customer) {
        getSession().persist(customer);
    }


    @Override
    public void deleteCustomerFromTempTable(String customerCode) {
        getSession().createQuery("delete from CustomerTempEntity c where c.customerCode=:custCode").setParameter("custCode",customerCode).executeUpdate();
    }

    @Override
    public void deleteCustomerFromMstTable(String customerCode) {
        getSession().createQuery("delete from CustomerMstEntity c where c.customerCode=:custCode").setParameter("custCode",customerCode).executeUpdate();

    }

    @Override
    public void modifyCustomerInTempTable(String customerCode, CustomerTempEntity customer) {
        getSession().update(customer);
    }

    @Override
    public void modifyCustomerInMstTable(String customerCode, CustomerMstEntity customer) {
        getSession().update(customer);
    }

    @Override
    public CustomerTempEntity getCustomerFromTempTable(String customerCode) {
        List<CustomerTempEntity> lists = getSession().createQuery("select c from CustomerTempEntity c where c.customerCode=:custCode", CustomerTempEntity.class).
                setParameter("custCode",customerCode).getResultList();
        if(!lists.isEmpty()){
            return lists.get(0);
        }else{
            return null;
        }
    }

    @Override
    public CustomerMstEntity getCustomerFromMstTable(String customerCode) {
        List<CustomerMstEntity> lists = getSession().createQuery("select c from CustomerMstEntity c where c.customerCode=:custCode", CustomerMstEntity.class).
                setParameter("custCode",customerCode).getResultList();
        if(!lists.isEmpty()){
            return lists.get(0);
        }else{
            return null;
        }
    }

    @Override
    public List<CustomerTempEntity> getAllCustomersFromTempTable() {
        return getSession().createQuery("select c from CustomerTempEntity c", CustomerTempEntity.class).getResultList();
    }

    @Override
    public List<CustomerMstEntity> getAllCustomersFromMstTable() {
        return getSession().createQuery("select c from CustomerMstEntity c", CustomerMstEntity.class).getResultList();
    }
}
