package com.example.UglyTwitter.model;

import javax.persistence.*;

@Entity
@Table(name = "commentaries")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentary_id")
    private Long id;

    @Column(name = "commentary_content")
    private String content;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private User author_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "post_id")
    private Post post_id;

    protected Comment() {
        super();
    }

    public Comment(String content, User author_id, Post post_id) {
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

    public User getAuthor_id() {
        return author_id;
    }

    public Post getPost_id() {
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

    public void setAuthor_id(User author_id) {
        this.author_id = author_id;
    }

    public void setPost_id(Post post_id) {
        this.post_id = post_id;
    }
}
