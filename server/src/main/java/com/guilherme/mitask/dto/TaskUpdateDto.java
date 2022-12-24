package com.guilherme.mitask.dto;

public class TaskUpdateDto {
    private Long id;
    private String title;
    private String contents;
    private Long idUSer;

    public TaskUpdateDto() {
    }

    public TaskUpdateDto(Long id, String title, String contents, Long idUser) {
        this.id = id;
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

    public Long getId() { return id; }
}
