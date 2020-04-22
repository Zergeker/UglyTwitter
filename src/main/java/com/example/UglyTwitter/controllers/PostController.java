package com.example.UglyTwitter.api;

import com.example.UglyTwitter.model.Post;
import com.samskivert.mustache.Mustache;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;



@RestController
public class PostController {

    @RequestMapping(value = "/getPosts", method = RequestMethod.GET)
    public ModelAndView getAllPosts (){
        ModelAndView model = new ModelAndView();
        model.addObject("title","Hello");
        model.setViewName("getPosts");
        return model;
    }


    @PostMapping("/post")
    public void postComment(@RequestBody Post post)
    {
        System.out.println("Hello");
    }
}
