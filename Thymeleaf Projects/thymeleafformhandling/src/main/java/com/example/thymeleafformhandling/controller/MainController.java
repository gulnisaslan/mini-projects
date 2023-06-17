package com.example.thymeleafformhandling.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.thymeleafformhandling.entity.User;

@Controller
public class MainController {
    
    @GetMapping("/register")
    private String showForm(Model model) {
        User user = new User();
        model.addAttribute("user",user); 
        List<String> professionList = Arrays.asList("Developer","Designer","UI-UX");
        model.addAttribute("professionList", professionList);
        return "register_form";
    }
    @PostMapping(value = "/register")
    private String submitForm(@ModelAttribute("user") User user) {
        System.out.println(user);
        return "register_sucess";
    }

}
