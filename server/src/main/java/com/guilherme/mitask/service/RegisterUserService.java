package com.guilherme.mitask.service;

import java.util.Optional;

import com.guilherme.mitask.dto.UserRegisterDto;
import com.guilherme.mitask.exceptions.EmailExist;
import com.guilherme.mitask.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserService {

    @Autowired
    UserService userService;

    public void userRegister(UserRegisterDto form) throws EmailExist {

        Optional<User> email = this.userService.findByEmail(form.getEmail());

        if (!email.isEmpty()) {
            throw new EmailExist();
        }

        User userRegister = form.encode();
        this.userService.save(userRegister);
    }
}
