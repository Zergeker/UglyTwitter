package com.example.UglyTwitter.api;

import com.example.UglyTwitter.model.Post;
import com.samskivert.mustache.Mustache;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;



@RestController
public class PostController {
    @ModelAttribute

    @GetMapping("/getPosts")
    public String getAllPosts (Model model){
        return "Hi";
    }


    @PostMapping("/post")
    public void postSmth(@RequestBody Post post)
    {
        System.out.println("Hello");
    }
}
