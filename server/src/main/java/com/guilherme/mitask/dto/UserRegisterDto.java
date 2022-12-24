package com.guilherme.mitask.dto;

import com.guilherme.mitask.model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserRegisterDto {
    String name;
    String email;
    String password;

    public UserRegisterDto() {
    }

    public UserRegisterDto(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public User encode() {
        String passwordEncoder = new BCryptPasswordEncoder().encode(password);
        return new User(name, email, passwordEncoder);
    }
}
