package com.guilherme.mitask.dto;

import com.guilherme.mitask.model.User;

public class TaskCreateDto {
    private String title;
    private String contents;
    private Long idUSer;

    public TaskCreateDto(String title, String contents, Long idUser) {
        this.title = title;
        this.contents = contents;
        this.idUSer = idUser;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public Long getUser() {
        return idUSer;
    }

}
