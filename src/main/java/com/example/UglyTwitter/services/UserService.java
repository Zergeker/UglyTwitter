package com.example.UglyTwitter.services;

import com.example.UglyTwitter.model.User;

import java.util.Optional;

public interface UserService {
    void save(User user);

    Optional<User> findByUserId(Long userId);

    User findByUsername(String username);
}
