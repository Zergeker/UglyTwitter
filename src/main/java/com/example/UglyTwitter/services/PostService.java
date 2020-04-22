package com.example.UglyTwitter.services;

import com.example.UglyTwitter.model.Post;

public interface PostService {
    void save(Post post);

    Post findByUserId(Long userId);
}
