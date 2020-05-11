package com.example.UglyTwitter.services;

import com.example.UglyTwitter.model.Comment;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface CommentService {
    void save(Comment comment);
    void delete(Long id);
    void deleteCommentsByPostId(Long id);

    Set<Comment> getCommentsByPostId(Long id);
    Comment FindById(Long id);
}
