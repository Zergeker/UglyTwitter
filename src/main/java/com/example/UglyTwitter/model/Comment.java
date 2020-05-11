package com.example.UglyTwitter.model;

import javax.persistence.*;

@Entity
@Table(name = "commentaries")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentary_id")
    private Long commentId;

    @Column(name = "commentary_content")
    private String content;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private Long author_id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "post_id")
    private Long post_id;

    public Comment() {
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
                commentId, content);
    }

    public Long getCommentId() {
        return commentId;
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

    public void setCommentId(Long id) {
        this.commentId = id;
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
