package com.example.Project.Integrated.Project.controller;


import com.example.Project.Integrated.Project.model.Role;
import com.example.Project.Integrated.Project.model.User;
import com.example.Project.Integrated.Project.repositry.RoleRepository;
import com.example.Project.Integrated.Project.repositry.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

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
