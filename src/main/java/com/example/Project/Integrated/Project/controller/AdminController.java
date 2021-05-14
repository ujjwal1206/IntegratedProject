package com.example.Project.Integrated.Project.controller;

import com.example.Project.Integrated.Project.model.Category;
import com.example.Project.Integrated.Project.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.AttributedString;

@Controller
public class AdminController {
    @Autowired
    CategoryService categoryService;
@RequestMapping("/admin")
    public String adminHome(){
    return "adminHome";
}
@RequestMapping("/admin/categories")
    public String Category(Model model){
    model.addAttribute("categories",categoryService.getAllCategory());
    return "category";
}
@GetMapping("/admin/categories/add")
    public String getCatAdd(Model model){
    model.addAttribute("category",new Category());
    return "categoriesAdd";
}
@PostMapping("/admin/categories/add")
public String postCatAdd(@ModelAttribute("category") Category category){
    categoryService.addCategory(category);
    return "redirect:/admin/categories";
}
}
