package com.guilherme.mitask.controller;

import com.guilherme.mitask.dto.UserRegisterDto;
import com.guilherme.mitask.model.User;
import com.guilherme.mitask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/register")
    public void RegisterUser(@RequestBody UserRegisterDto userRegisterDto){
        this.userService.save(new User(userRegisterDto));
    }
}
