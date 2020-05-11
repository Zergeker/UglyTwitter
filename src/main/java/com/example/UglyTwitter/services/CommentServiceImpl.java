package com.example.UglyTwitter.services;

import com.example.UglyTwitter.model.Comment;
import com.example.UglyTwitter.repositories.CommentRepository;
import com.example.UglyTwitter.repositories.PostRepository;
import com.example.UglyTwitter.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentRepository commentRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    PostRepository postRepository;

    @Override
    public void save(Comment comment){
        commentRepository.save(comment);
    }

    @Override
    public void delete(Long id) { commentRepository.deleteById(id);}

    @Override
    public void deleteCommentsByPostId(Long id) {commentRepository.deleteCommentsByPostId(id);}

    @Override
    public Comment FindById (Long id){
        return commentRepository.findByCommentId(id);
    }
}
