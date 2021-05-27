package com.example.Project.Integrated.Project.config;


import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyErrorController implements ErrorController {
    @RequestMapping("/error")
    public String handleError(HttpServletRequest request){
        Integer statusCode =(Integer) request.getAttribute("javax.servlet.error.status_code");
        Exception exception=(Exception) request.getAttribute("javax.servlet.error.exception");
        return "error";
    }
    @Override
    public String getErrorPath(){
        return "/error";
    }
}
