package com.example.UglyTwitter.services;

import com.example.UglyTwitter.model.Post;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public interface PostService {
    void save(Post post);

    Post FindById(Long id);
}
