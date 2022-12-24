package com.guilherme.mitask.controller;

import javax.validation.Valid;

import com.guilherme.mitask.dto.LoginFormDto;
import com.guilherme.mitask.dto.TokenDto;
import com.guilherme.mitask.service.AuthUserService;
import com.guilherme.mitask.webSecurityConfig.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthenticationManager authManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity<?> authenticate(@RequestBody LoginFormDto form) {

        AuthUserService authService = new AuthUserService(authManager, tokenService);

        return authService.authUser(form);
    }
}
