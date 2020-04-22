package com.example.UglyTwitter.services;

import com.example.UglyTwitter.model.User;

public interface UserService {
    void save(User user);

    User findByNickname(String nickname);
}
