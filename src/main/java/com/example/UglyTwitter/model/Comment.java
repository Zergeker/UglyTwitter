package com.example.UglyTwitter.model;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COMMENT_ID")
    private Long id;

    @Column(name = "CONTENT")
    private String content;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AUTHOR_ID")
    private Long author_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "POST_ID")
    private Long post_id;

    protected Comment() {
        super();
    }

    public Comment(String content, Long author_id, Long post_id) {
        super();
        this.content = content;
        this.author_id = author_id;
        this.post_id = post_id;
    }

    @Override
    public String toString() {
        return String.format(
                "Comment[id=%d, content='%s']",
                id, content);
    }

    public Long getId() {
        return id;
    }

    public Long getAuthor_id() {
        return author_id;
    }

    public Long getPost_id() {
        return post_id;
    }


    public String getContent() {
        return content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor_id(Long author_id) {
        this.author_id = author_id;
    }

    public void setPost_id(Long post_id) {
        this.post_id = post_id;
    }
}
