package com.example.UglyTwitter.controllers;

import com.example.UglyTwitter.model.User;
import com.example.UglyTwitter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistration;
import org.springframework.web.servlet.view.RedirectView;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public ModelAndView registration (){
        ModelAndView model = new ModelAndView();
        model.addObject("userForm", new User());
        model.setViewName("registration");
        return model;
    }

    @PostMapping("/registration")
    public RedirectView registration(@ModelAttribute("userForm") User userForm){

        userService.save(userForm);

        return new RedirectView("login");
    }

}
