package com.example.UglyTwitter.services;

import com.example.UglyTwitter.model.Comment;

public interface CommentService {
    void save(Comment comment);

    Comment findByUserId(Long userId);
}
