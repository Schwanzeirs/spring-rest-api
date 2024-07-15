package com.bootcamp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.dto.UserRequest;
import com.bootcamp.entities.User;
import com.bootcamp.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/insert")
    public User insert(@RequestBody UserRequest request) {
        return userService.insertUser(request);
    }

    @PostMapping("/login")
    public User login(@RequestBody UserRequest request) {
        return userService.validateUser(request);
    }
}
