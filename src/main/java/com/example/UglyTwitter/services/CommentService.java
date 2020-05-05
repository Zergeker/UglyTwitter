package com.example.UglyTwitter.services;

import com.example.UglyTwitter.model.Comment;

import java.util.Optional;

public interface CommentService {
    void save(Comment comment);

    void delete(Comment comment);

    Comment findByUserId(Long userId);

    Optional<Comment> findByCommentId(Long commentId);
}
