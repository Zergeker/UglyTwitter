package com.example.UglyTwitter.controllers;

import com.example.UglyTwitter.model.Comment;
import com.example.UglyTwitter.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/creaeComment")
    public RedirectView createComment(@ModelAttribute("createComment") Comment commentForm) {

        commentService.save(commentForm);

        return new RedirectView("");//Возвращает страницу поста, со всеми комментами
    }

}
