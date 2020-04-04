package com.project.uglyTwitter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nikname;
    private String password;

    protected User() {}

    public User(String firstName, String lastName) {
        this.nikname = firstName;
        this.password = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, nikname='%s', password='%s']",
                id, nikname, password);
    }

    public Long getId() {
        return id;
    }

    public String getNikname() {
        return nikname;
    }

    public String getPassword() {
        return password;
    }
}