package com.customerapp.model.hibernate.service.impl;

import com.customerapp.model.hibernate.repository.entities.UserEntity;
import com.customerapp.model.hibernate.repository.interfaces.UserRepo;
import com.customerapp.model.hibernate.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service(value = "userService")
@Transactional
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void addUser(UserEntity user) {
        userRepo.addUser(user);
    }

    @Override
    public UserEntity getUserByEmailAndPassword(String email, String password) {
        return userRepo.getUserByEmailAndPassword(email,password);
    }
}
