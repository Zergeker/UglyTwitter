package com.example.UglyTwitter.repositories;

import com.example.UglyTwitter.model.Post;
import com.example.UglyTwitter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PostRepo extends JpaRepository<Post, Long> {

    @Query("SELECT post FROM POST where post.author_id = :userId")
    Post findByUserId(@Param("userId") Long userId);
}
