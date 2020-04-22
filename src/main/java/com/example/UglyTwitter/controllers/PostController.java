package com.example.UglyTwitter.controllers;

import com.example.UglyTwitter.model.Post;
import com.example.UglyTwitter.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping("/createPost")
    public RedirectView createPost(@ModelAttribute("postForm") Post postForm) {

        postService.save(postForm);

        return new RedirectView("");//Будет возвращать на страницу поста
    }
}
