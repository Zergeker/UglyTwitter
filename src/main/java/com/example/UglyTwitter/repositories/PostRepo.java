package com.example.UglyTwitter.repositories;

import com.example.UglyTwitter.model.Post;
import com.example.UglyTwitter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends JpaRepository<Post, Long> {

    Post findById(long id);
}
