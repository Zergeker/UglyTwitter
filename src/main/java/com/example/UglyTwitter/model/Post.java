package com.example.UglyTwitter.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "POST")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long postId;

    @Column(name = "post_title")
    private String title;

    @Column(name = "post_content")
    private String text_content;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private Long author_id;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "post_id", cascade = CascadeType.ALL)
    private Set<Comment> postComment;

    public Post() {
        super();
    }

    public Post(String firstName, String lastName, Long author_id, Set<Comment> postComment) {
        super();
        this.title = firstName;
        this.text_content = lastName;
        this.author_id = author_id;
        this.postComment = postComment;
    }

    @Override
    public String toString() {
        return String.format(
                "Post[id=%d, title='%s', text_content='%s']",
                postId, title, text_content);
    }

    public Long getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public String getText_content() {
        return text_content;
    }

    public Long getAuthor_id() {
        return author_id;
    }

    public Set<Comment> getPostComment() {
        return postComment;
    }

    public void setPostId(Long id) {
        this.postId = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText_content(String text_content) {
        this.text_content = text_content;
    }

    public void setAuthor_id(Long author_id) {
        this.author_id = author_id;
    }

    public void setPostComment(Set<Comment> postComment) {
        this.postComment = postComment;
    }
}