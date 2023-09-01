package com.customerapp.model.hibernate.repository.impl;

import com.customerapp.model.hibernate.repository.entities.UserEntity;
import com.customerapp.model.hibernate.repository.dbexceptions.UserNotFoundException;
import com.customerapp.model.hibernate.repository.interfaces.UserRepo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepoImpl implements UserRepo {
    private final SessionFactory sessionFactory;

    @Autowired
    public UserRepoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }


    @Override
    public void addUser(UserEntity user) {
        getSession().persist(user);
    }

    @Override
    public UserEntity getUserByEmailAndPassword(String email, String password) {
        List<UserEntity> users=getSession()
                .createQuery("from UserEntity u where u.userEmail=:email and u.password=:password",UserEntity.class)
                .setParameter("email" , email).setParameter("password",password)
                .getResultList();

        if(users.size()>0)
            return users.get(0);
        else {
            return null;
        }
    }
}
