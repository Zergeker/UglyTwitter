package com.example.UglyTwitter.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WebController {
    @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
    public ModelAndView getToLoginPage (){
        ModelAndView result = new ModelAndView();
        result.addObject("title", "Hello");
        result.setViewName("login.mustache");
        return result;
    }
}
