package com.guilherme.mitask.service;

import com.guilherme.mitask.dto.LoginFormDto;
import com.guilherme.mitask.dto.TokenDto;
import com.guilherme.mitask.webSecurityConfig.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

@Service
public class AuthUserService {

     @Autowired
    private AuthenticationManager authManager;

     @Autowired
    private TokenService tokenService;

    @Autowired
    public AuthUserService(AuthenticationManager authManager, TokenService tokenService) {
        this.authManager = authManager;
        this.tokenService = tokenService;
    }

    public ResponseEntity<?> authUser(LoginFormDto form) {
        UsernamePasswordAuthenticationToken Login = form.convert();

        try {
            Authentication authentication = authManager.authenticate(Login);
            String token = tokenService.genToken(authentication);
            TokenDto tokenClient = new TokenDto(token, "Bearer");

            return ResponseEntity.ok(tokenClient);
        } catch (AuthenticationException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
