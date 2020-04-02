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
    @RequestMapping("/getPosts")
    @GetMapping
    public ArrayList<Post> getAllPosts (Model model){
        ArrayList<Post> db = new ArrayList<Post>();
        db.add(new Post("First Header", "First text"));
        db.add(new Post("Second Header", "Second text"));
        db.add(new Post("Third Header", "Third text"));
        model.addAttribute("getPosts", db);
        return db;
    }

    @RequestMapping("/post")
    @PostMapping
    public void postSmth(@RequestBody Post post)
    { ;
        System.out.println(post.id);
        System.out.println(post.title);
        System.out.println(post.content);
    }
}
