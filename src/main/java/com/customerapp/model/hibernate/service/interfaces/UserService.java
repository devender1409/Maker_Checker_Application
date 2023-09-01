package com.customerapp.model.hibernate.service.interfaces;

import com.customerapp.model.hibernate.repository.entities.UserEntity;

public interface UserService {
    public void addUser(UserEntity user);
    public UserEntity getUserByEmailAndPassword(String email, String password);
}
