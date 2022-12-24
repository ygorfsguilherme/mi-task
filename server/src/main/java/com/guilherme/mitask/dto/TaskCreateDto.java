package com.guilherme.mitask.dto;

import com.guilherme.mitask.model.User;

public class TaskCreateDto {
    private String title;
    private String contents;

    public TaskCreateDto() {
    }

    public TaskCreateDto(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

}
