package com.guilherme.mitask.model;

import com.guilherme.mitask.dto.TaskCreateDto;
import com.guilherme.mitask.dto.TaskUpdateDto;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String contents;
    LocalDate date = LocalDate.now();
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Task() {
    }

    public Task(TaskCreateDto taskCreateDto, User user) {
        this.title = taskCreateDto.getTitle();
        this.contents = taskCreateDto.getContents();
        this.user = user;
    }

    public Task(TaskUpdateDto taskUpdateDto, User user) {
        this.title = taskUpdateDto.getTitle();
        this.contents = taskUpdateDto.getContents();
        this.user = user;
    }

    public Task(TaskUpdateDto taskUpdateDto) {
        this.title = taskUpdateDto.getTitle();
        this.contents = taskUpdateDto.getContents();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public LocalDate getDate() {
        return date;
    }

    public User getUser() {
        return user;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
