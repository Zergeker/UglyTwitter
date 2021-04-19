package com.example.UglyTwitter.repositories;

import com.example.UglyTwitter.model.Comment;
import com.example.UglyTwitter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    Comment findById(long id);

    Comment findByPostId(long id);
}