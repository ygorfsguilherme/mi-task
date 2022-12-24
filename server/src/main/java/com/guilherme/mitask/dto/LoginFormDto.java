package com.guilherme.mitask.dto;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class LoginFormDto {
    private String password;

    private String email;

    public LoginFormDto(){}

    public LoginFormDto(String password, String email) {
        this.password = password;
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public UsernamePasswordAuthenticationToken convert() {
        return new UsernamePasswordAuthenticationToken(email, password);
    }

}
