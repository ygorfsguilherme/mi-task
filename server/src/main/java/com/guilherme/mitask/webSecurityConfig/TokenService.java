package com.guilherme.mitask.webSecurityConfig;

import java.util.Date;

import com.guilherme.mitask.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenService {

    @Value("${mitask.jwt.expiration}")
    private String expiration;

    @Value("${mitask.jwt.secret}")
    private String secret;

    public String genToken(Authentication authentication) {
        User userLogin = (User) authentication.getPrincipal();
        Date today = new Date();
        Date dateExpiration = new Date(today.getTime() + Long.parseLong(expiration));

        return Jwts.builder()
        .setIssuer("mi task")
        .setSubject(userLogin.getUsername())
        .setIssuedAt(today)
        .setExpiration(dateExpiration)
        .signWith(SignatureAlgorithm.HS256, secret)
        .compact();
    }

    public boolean isTokenValid(String token) {
        try {
            Jwts.parser().setSigningKey(this.secret).parseClaimsJws(token);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public String getUsername(String token) {
        Claims claims = Jwts.parser().setSigningKey(this.secret).parseClaimsJws(token).getBody();
        return claims.getSubject();
    }

}
