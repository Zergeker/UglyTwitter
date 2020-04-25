package com.example.UglyTwitter.services;

import com.example.UglyTwitter.model.Post;

public interface PostService {
    void save(Post post);


    void delete(Post post);

    Post findByUserId(Long userId);

    Post findByPostId(Long postId);
}
