package com.guilherme.mitask.dto;

import com.guilherme.mitask.model.Task;

import java.time.LocalDate;

public class TaskDto {
    private Long id;
    private String title;
    private String contents;
    private LocalDate date;
    public TaskDto(Task task) {
        this.id = task.getId();
        this.title = task.getTitle();
        this.contents = task.getContents();
        this.date = task.getDate();
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
}
