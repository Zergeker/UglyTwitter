package com.example.UglyTwitter.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private Long id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_PASSWORD")
    private String password;
    @Transient
    private String passwordConfirm;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Post> userPost;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Comment> userComment;

    protected User() {
        super();
    }

    public User(String firstName, String lastName, Set<Post> userPost, Set<Comment> userComment) {
        super();
        this.userName = firstName;
        this.password = lastName;
        this.userPost = userPost;
        this.userComment = userComment;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%d, userName='%s', password='%s']",
                id, userName, password);
    }

    public Long getId() {
        return id;
    }


    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Set<Post> getUserPost() {
        return userPost;
    }

    public Set<Comment> getUserComment() {
        return userComment;
    }

    public void setID() {
        this.id = id;
    }

    public void setUserName() {
        this.userName = userName;
    }

    public void setPassword() {
        this.password = password;
    }

    public void setUserPost(Set<Post> userPost) {
        this.userPost = userPost;
    }

    public void setUserComment(Set<Comment> userComment) {
        this.userComment = userComment;
    }


}
