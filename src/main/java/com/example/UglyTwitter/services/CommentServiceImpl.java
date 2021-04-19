package com.example.UglyTwitter.services;

import com.example.UglyTwitter.model.Comment;
import com.example.UglyTwitter.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public void save(Comment comment) {
    }

    @Override
    public void update(Comment comment) {
        if (commentRepository.findById(comment.getId()) != null)
            commentRepository.save(comment);
        else throw new ResponseStatusException(HttpStatus.NOT_FOUND, "UnableToFindUser");
    }

    @Override
    public void deleteById(Long commentId) {
        commentRepository.deleteById(commentId);
    }

    ;

    @Override
    public Optional<Comment> findById(Long id) {
        return commentRepository.findById(id);
    }

    @Override
    public Comment findByPostId(Long postId) {
        return commentRepository.findByPostId(postId);
    }

    ;

}
