package com.guilherme.mitask.service;

import com.guilherme.mitask.model.User;
import com.guilherme.mitask.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    UserRepository userRepository;

    public void save(User user){
        this.userRepository.save(user);
    }
}
