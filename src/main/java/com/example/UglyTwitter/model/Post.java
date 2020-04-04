package com.example.UglyTwitter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String title;
    private String text_content;
    private Long author_id;

    protected Post() {}

    public Post(String firstName, String lastName) {
        this.title = firstName;
        this.text_content = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, title='%s', text_content='%s']",
                id, title, text_content);
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText_content() {
        return text_content;
    }
}