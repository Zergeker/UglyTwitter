package com.example.UglyTwitter.services;

import com.example.UglyTwitter.model.Comment;

import java.util.Optional;

public interface CommentService {
    void save(Comment comment);

    void update(Comment comment);

    void deleteById(Long commentId);

    Optional<Comment> findById(Long id);

    Comment findByPostId(Long userId);
}
