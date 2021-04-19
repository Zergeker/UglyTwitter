package com.example.UglyTwitter.services;

import com.example.UglyTwitter.model.Post;
import org.springframework.security.core.parameters.P;

public interface PostService {
    void save(Post post);

    Post findByUserId(Long userId);

    Post findById(Long postId);
}
