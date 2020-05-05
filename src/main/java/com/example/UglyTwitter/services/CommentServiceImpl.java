package com.example.UglyTwitter.services;

import com.example.UglyTwitter.model.Comment;
import com.example.UglyTwitter.repositories.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepo commentRepo;

    @Override
    public void save(Comment comment) {
        commentRepo.save(comment);
    }

    @Override
    public void delete(Comment comment) {
        commentRepo.delete(comment);
    }

    @Override
    public Optional<Comment> findByCommentId(Long commentId) {
        return commentRepo.findById(commentId);
    }

    @Override
    public Comment findByUserId(Long userId) {
        return commentRepo.findByUserId(userId);
    }

}
