package com.example.UglyTwitter.repositories;

import com.example.UglyTwitter.model.Comment;
import com.example.UglyTwitter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CommentRepo extends JpaRepository<Comment, Long> {

    @Query("SELECT comment FROM commentaries where comment.author_id = :userId")
    Comment findByUserId(@Param("userId") long userId);

}