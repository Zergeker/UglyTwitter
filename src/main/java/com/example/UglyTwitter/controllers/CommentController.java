package com.example.UglyTwitter.controllers;

import com.example.UglyTwitter.model.Comment;
import com.example.UglyTwitter.model.Post;
import com.example.UglyTwitter.repositories.PostRepository;
import com.example.UglyTwitter.repositories.UserRepository;
import com.example.UglyTwitter.services.CommentService;
import com.example.UglyTwitter.services.PostService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    @Autowired
    UserRepository userRepository;

    @Autowired
    PostRepository postRepository;

    @GetMapping("/addComment")
    public String addComment(){
        Comment comment = new Comment();
        comment.setAuthor_id(userRepository.findByuserName("peplix").getUserId());
        comment.setContent("Some content");
        comment.setPost_id(2L);
        commentService.save(comment);//нужно чтобы коммент добавлялся еще и к посту
        return "Success!";
    }

    @GetMapping("/getComment")
    public String getComment(){
        return commentService.FindById(2L).toString();
    }

    @GetMapping("/deleteComment")
    public String deleteComment(){
        commentService.delete(2L);//нужно чтобы коммент удалялся еще и у поста
        return "Comment deleted!";
    }
}

