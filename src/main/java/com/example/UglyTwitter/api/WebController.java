package com.example.UglyTwitter.api;

import com.example.UglyTwitter.model.*;
import com.example.UglyTwitter.repo.UserRepo;
import com.samskivert.mustache.Mustache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class WebController {
    @Autowired
    UserRepo userRepo;

    @RequestMapping("/saveUser")
    public String saveUser(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        userRepo.save(new User(userName, password));
        return "Done";
    }

    @RequestMapping("/showAllUsers")
    public String showAllUsers() {
        StringBuilder users = new StringBuilder();

        for (User user : userRepo.findAll()) {
            users.append(user.toString()).append("<br>");
        }
        return users.toString();
    }

    @RequestMapping("/findUserByID")
    public String findUserByID(@RequestParam("id") long id){
        String user = "";
        user = userRepo.findById(id).toString();
        return user;
    }

    @GetMapping("/getPosts")
    public String getAllPosts(Model model) {
        return "Hi";
    }


    @PostMapping("/post")
    public void postSmth(@RequestBody Post post) {
        System.out.println("Hello");
    }
}
