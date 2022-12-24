package com.guilherme.mitask.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table (name = "users_roles")
public class UserRole implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    public String getUsername() {
        return this.name;
    }
    public void setUsername(String username) {
        this.name = username;
    }

    @Override
    public String getAuthority() {
        return this.name;
    } 
}
