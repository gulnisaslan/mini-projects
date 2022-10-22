package com.example.userservice.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userservice.Entity.User;
import com.example.userservice.Service.UserService;
import com.example.userservice.VO.ResponseTemplate;

import lombok.extern.slf4j.Slf4j;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(value = "/api/users/")
@Slf4j
public class UsersController {

    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

 
    @PostMapping(value="add")
    public User saveUser (@RequestBody  User user) {
       
        log.info("Inside saveUser of UserController");
        return this.userService.save(user);
    }
    @GetMapping(value="id")
    public ResponseTemplate getUserWithDeparmentId(@PathVariable("id") Long userId) {
        return this.userService.getUserWithDeparmentId(userId);
    }
    
    
    
    
}
