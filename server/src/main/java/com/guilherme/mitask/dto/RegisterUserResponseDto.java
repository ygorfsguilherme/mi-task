package com.guilherme.mitask.dto;

import com.guilherme.mitask.model.User;

public class RegisterUserResponseDto {
    Long id;
    String name;
    String email;

    public RegisterUserResponseDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
