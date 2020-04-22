package com.example.UglyTwitter.api;

import com.example.UglyTwitter.model.User;
import com.example.UglyTwitter.services.SecurityService;
import com.example.UglyTwitter.services.UserService;
import com.example.UglyTwitter.services.UserValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
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
    public String login(Model model, String error, String logout){
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login.mustache";
    }

    @GetMapping({"/", "/welcome"})
    public String welcome(Model model) {
        return "welcome";
    }
}
