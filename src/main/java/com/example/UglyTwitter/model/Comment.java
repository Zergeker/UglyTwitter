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

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Long author_id) {
        this.author_id = author_id;
    }

    public Long getPost_id() {
        return post_id;
    }

    public void setPost_id(Long post_id) {
        this.post_id = post_id;
    }

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