package com.example.Project.Integrated.Project.service;


import com.example.Project.Integrated.Project.model.CustomUserDetail;
import com.example.Project.Integrated.Project.model.User;
import com.example.Project.Integrated.Project.repositry.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailService implements UserDetailsService {


    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user=userRepository.findUserByEmail(email);
        user.orElseThrow(()->new UsernameNotFoundException("Milla nhiii bhai ea koi user21"));
        return user.map(CustomUserDetail::new).get();

    }
}
