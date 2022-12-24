package com.guilherme.mitask.dto;

import com.guilherme.mitask.model.Task;

import java.time.LocalDate;

public class TaskListDto {
    private Long id;
    private String title;
    private String contents;
    private LocalDate date;

    public TaskListDto() {
    }

    public TaskListDto(Task listTask) {
        this.id = listTask.getId();
        this.title = listTask.getTitle();
        this.contents = listTask.getContents();
        this.date = listTask.getDate();
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
