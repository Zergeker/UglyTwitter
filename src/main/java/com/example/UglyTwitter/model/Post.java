package com.example.UglyTwitter.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Post {
    public UUID id;
    public String title;
    public String content;

    public Post (@JsonProperty("title") String title,
                 @JsonProperty("content") String content){
        this.id = UUID.randomUUID();
        this.title = title;
        this.content = content;
    }
}
