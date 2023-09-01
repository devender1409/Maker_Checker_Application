package com.customerapp.web.controller;

import com.customerapp.model.hibernate.repository.entities.UserEntity;
import com.customerapp.model.hibernate.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
public class LoginLogOutController {
    private final UserService userService;

    @Autowired
    public LoginLogOutController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String home(Locale locale){
        return "loginpage";
    }

    @PostMapping("/login")
    public String handleLogin(HttpServletRequest request, HttpSession session){
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        if(email.equals("") || password.equals("")) return "loginpage";
        UserEntity user = userService.getUserByEmailAndPassword(email,password);

        if(user==null) return "loginpage";

        session.setAttribute("user",user);

        if(user.getRole().equals("M")){
            return "redirect:maker.do/home";
        }else if(user.getRole().equals("C")){
            return "redirect:checker.do/home";
        }
        return "login?message=Authentication Failed";
    }

    @GetMapping("logout")
    public String handleLogOut(HttpSession session){
        session.invalidate();
        return "loginpage";
    }

}
