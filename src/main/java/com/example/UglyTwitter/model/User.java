package com.example.UglyTwitter.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User_Id")
    private Long userId;

    @Column(name = "User_Name")
    private String userName;

    @Column(name = "User_Password")
    private String password;
    @Transient
    private String passwordConfirm;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "author_id", cascade = CascadeType.ALL)
    private Set<Post> userPost;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "author_id", cascade = CascadeType.ALL)
    private Set<Comment> userComment;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Role> roles;

    public User() {
        super();
    }

    public User(String firstName, String lastName) {
        super();
        this.userName = firstName;
        this.password = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%d, userName='%s', password='%s']",
                userId, userName, password);
    }

    public Long getUserId() {
        return userId;
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

    public void setUserId(Long id) {
        this.userId = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void setUserPost(Set<Post> userPost) {
        this.userPost = userPost;
    }

    public void setUserComment(Set<Comment> userComment) {
        this.userComment = userComment;
    }


}
