package com.example.UglyTwitter.repo;

import com.example.UglyTwitter.model.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepo extends CrudRepository<Comment, Long> {

    Comment findById(long id);
}


