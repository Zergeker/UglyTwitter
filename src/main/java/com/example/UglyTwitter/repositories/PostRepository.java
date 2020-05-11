package com.example.UglyTwitter.repositories;

import com.example.UglyTwitter.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Post findByPostId(Long id);
}
