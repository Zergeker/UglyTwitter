package com.example.UglyTwitter.controllers;

import com.example.UglyTwitter.model.Post;
import com.example.UglyTwitter.services.CommentService;
import com.example.UglyTwitter.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @Autowired
    private CommentService commentService;

    @PostMapping("/createPost")
    public RedirectView createPost(@ModelAttribute("postForm") Post postForm) {

        postService.save(postForm);

        return new RedirectView("");//Будет возвращать на страницу поста
    }

    @PostMapping("/viewPost")
    public RedirectView viewPost(@ModelAttribute ("postForm") Post postForm){
        postService.findById(postForm.getId());
        commentService.findByPostId(postForm.getId());

        return new RedirectView("");//Будет возвращать на страницу поста
    }
}
