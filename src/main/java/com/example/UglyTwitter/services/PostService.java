package com.example.UglyTwitter.services;

import com.example.UglyTwitter.model.Post;

import java.util.Optional;

public interface PostService {
    void save(Post post);

    void delete(Post post);

    Post findByUserId(Long userId);

    Optional<Post> findByPostId(Long postId);
}
