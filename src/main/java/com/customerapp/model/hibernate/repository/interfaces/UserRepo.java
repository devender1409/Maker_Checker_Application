package com.customerapp.model.hibernate.repository.interfaces;

import com.customerapp.model.hibernate.repository.entities.UserEntity;

public interface UserRepo {
    public void addUser(UserEntity user);
    public UserEntity getUserByEmailAndPassword(String email,String password);
}
