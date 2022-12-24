package com.guilherme.mitask.controller;

import com.guilherme.mitask.dto.RegisterUserResponseDto;
import com.guilherme.mitask.dto.UserRegisterDto;
import com.guilherme.mitask.exceptions.EmailExist;
import com.guilherme.mitask.service.RegisterUserService;
import com.guilherme.mitask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class RegisterController {
    @Autowired
    UserService userService;

    @Autowired
    RegisterUserService registerUserService;
    @PostMapping("/register")
    public ResponseEntity<?> RegisterUser(@RequestBody UserRegisterDto form){

        try{
            this.registerUserService.userRegister(form);
            return ResponseEntity.status(201).build();
        }catch (EmailExist ex){
            return ResponseEntity.badRequest().body(ex.toString().getBytes());
        }
    }
}
