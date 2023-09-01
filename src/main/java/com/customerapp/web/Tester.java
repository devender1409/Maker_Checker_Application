package com.customerapp.web;

import com.customerapp.model.hibernate.repository.entities.UserEntity;
import com.customerapp.model.hibernate.service.interfaces.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.core.userdetails.User;

public class Tester {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("model-config.xml");
        UserService userService=context.getBean("userService", UserService.class);

        UserEntity user1 = new UserEntity("Megha Bhardwaj Mam","megha.bhardwaj","megha.bhardwaj@nu.com","megha@123","M");
        UserEntity user2 = new UserEntity("Neelam Aggrawal Mam","neelam.aggrawal","neelam.aggrawal@nu.com","neelam@123","C");
        UserEntity user3 = new UserEntity("Ankur Chaturvedi Sir","ankur.chaturvedi","ankur.chaturvedi@nu.com","ankur@123","C");
        UserEntity user4 = new UserEntity("Pooja Sharma Mam","pooja.sharma","pooja.sharma@nu.com","pooja@123","M");

//        UserEntity user5 = new UserEntity("random","random.kumar","");
        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);
        userService.addUser(user4);

        UserEntity user = userService.getUserByEmailAndPassword("megha.bhardwaj@nu.com","megha@123");
        System.out.println(user);


//        CustomerMstEntity customerMst = TempToMst.parse();
    }
}
