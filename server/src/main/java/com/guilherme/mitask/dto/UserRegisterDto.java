package com.guilherme.mitask.dto;

public class UserRegisterDto {
    String name;
    String email;
    String password;

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

}
