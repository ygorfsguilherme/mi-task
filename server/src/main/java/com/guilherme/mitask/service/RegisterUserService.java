package com.guilherme.mitask.service;

import java.util.Optional;

import com.guilherme.mitask.dto.UserRegisterDto;
import com.guilherme.mitask.exceptions.EmailAlreadyExistsException;
import com.guilherme.mitask.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserService {

    @Autowired
    UserService userService;

    public void userRegister(UserRegisterDto form) throws EmailAlreadyExistsException {

        Optional<User> email = this.userService.findByEmail(form.getEmail());

        if (!email.isEmpty()) {
            throw new EmailAlreadyExistsException();
        }

        User userRegister = form.encode();
        this.userService.save(userRegister);
    }
}
