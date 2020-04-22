package com.example.UglyTwitter.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nickname;
    private String password;
    @Transient
    private String passwordConfirm;

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    @ManyToMany
    private Set<Role> roles;

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public User() {}

    public void setId(Long id) {
        this.id = id;
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

    public User(String firstName, String lastName) {
        this.nickname = firstName;
        this.password = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, nickname='%s', password='%s']",
                id, nickname, password);
    }

    public Long getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }
}