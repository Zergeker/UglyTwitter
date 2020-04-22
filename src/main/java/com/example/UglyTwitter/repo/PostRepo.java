package com.example.UglyTwitter.repo;

import com.example.UglyTwitter.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Long> {

    Post findById(long id);
}
