package com.example.demo.dto;

public class PostDto {
    Integer id;
    String title;
    String content;
    String username;

    //멤버 변수 초기화
    public PostDto(Integer id, String title, String content, String username) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getUsername() {
        return username;
    }
}
