package com.example.UglyTwitter.services;

import com.example.UglyTwitter.model.Comment;

public interface CommentService {
    void save(Comment comment);

    void delete(Comment comment);

    Comment findByUserId(Long userId);

    Comment findByCommentId(Long commentId);
}
