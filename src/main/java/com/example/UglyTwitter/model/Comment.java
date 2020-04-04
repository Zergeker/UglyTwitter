package com.example.UglyTwitter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String content;
    private Long author_id;
    private Long post_id;

    protected Comment() {}

    public Comment(String firstName, String lastName) {
        this.content = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, content='%s']",
                id, content);
    }

    public Long getId() {
        return id;
    }


    public String getContent() {
        return content;
    }
}