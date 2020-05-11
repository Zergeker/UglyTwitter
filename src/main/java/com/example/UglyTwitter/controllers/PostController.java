package com.example.UglyTwitter.controllers;

import com.example.UglyTwitter.model.Post;
import com.example.UglyTwitter.repositories.UserRepository;
import com.example.UglyTwitter.services.PostService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PostController {
    @Autowired
    PostService postService;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/addPost")
    public String addPost(){
        Post post = new Post();
        post.setTitle("New Title");
        post.setText_content("Hello world!");
        post.setAuthor_id(userRepository.findByuserName("peplix"));
        postService.save(post);
        return "Success!";
    }

    @GetMapping("/getPost")
    public String getPost(){
        return postService.FindById(Long.valueOf(2)).toString();
    }
}
