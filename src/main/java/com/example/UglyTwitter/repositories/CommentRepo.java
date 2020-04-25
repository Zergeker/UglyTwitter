package com.example.UglyTwitter.repositories;

import com.example.UglyTwitter.model.Comment;
import com.example.UglyTwitter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepo extends JpaRepository<Comment, Long> {

    Comment findByCommentId(long commentId);

    Comment findByUserId(long userId);
}