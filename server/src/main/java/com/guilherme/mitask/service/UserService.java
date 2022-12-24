package com.guilherme.mitask.service;

import com.guilherme.mitask.model.User;
import com.guilherme.mitask.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void save(User user){

        this.userRepository.save(user);
    }

    public Optional<User> findByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    public User findByName(String name) {
        return this.userRepository.findByName(name);
    }
}
