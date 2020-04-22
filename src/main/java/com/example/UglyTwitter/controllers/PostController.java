/*package com.example.UglyTwitter.controllers;

import com.example.UglyTwitter.model.Post;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


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
*/