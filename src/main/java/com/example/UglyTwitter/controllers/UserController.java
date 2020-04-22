/*package com.example.UglyTwitter.controllers;

import com.example.UglyTwitter.model.User;
import com.example.UglyTwitter.services.SecurityService;
import com.example.UglyTwitter.services.UserService;
import com.example.UglyTwitter.services.UserValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidationService userValidator;

    @GetMapping("/registration")
    public String registration (Model model){
        model.addAttribute("userForm", new User());

        return "registration.jsp";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult){
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()){
            return "registration.jsp";
        }

        userService.save(userForm);

        securityService.autoLogin(userForm.getNickname(), userForm.getPasswordConfirm());
        return "redirect:/welcome";
    }

    @GetMapping("/login")
    public ModelAndView login(String error, String logout){
        ModelAndView model = new ModelAndView();
        if (error != null)
            model.addObject("error", "Your username and password is invalid.");

        if (logout != null)
            model.addObject("message", "You have been logged out successfully.");
        model.setViewName("login.html");
        return model;
    }

    @GetMapping({"/", "/welcome"})
    public String welcome(Model model) {
        return "welcome";
    }
}*/
