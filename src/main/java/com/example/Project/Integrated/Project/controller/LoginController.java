package com.example.Project.Integrated.Project.controller;


import com.example.Project.Integrated.Project.repositry.RoleRepository;
import com.example.Project.Integrated.Project.repositry.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/register")
    public String registerGet(){
        return "register";
    }
}
