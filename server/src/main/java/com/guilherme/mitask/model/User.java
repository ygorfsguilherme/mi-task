package com.guilherme.mitask.model;

import com.guilherme.mitask.dto.UserRegisterDto;

import javax.persistence.*;
import java.util.List;

@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String email;
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user", fetch = FetchType.LAZY)
    private List<Task> tasks;

    public User() {
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(UserRegisterDto userRegisterDto) {
        this.name = userRegisterDto.getName();
        this.email = userRegisterDto.getEmail();
        this.password = userRegisterDto.getPassword();
    }

    public Long getId() {
        return id;
    }

    public String getName() { return name; }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
