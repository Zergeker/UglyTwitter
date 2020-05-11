package com.example.UglyTwitter.services;

import com.example.UglyTwitter.model.Comment;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    void save(Comment comment);
    void delete(Long id);
    void deleteCommentsByPostId(Long id);

    Comment FindById(Long id);
}
