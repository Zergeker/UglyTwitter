package com.example.UglyTwitter.repositories;

import com.example.UglyTwitter.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Comment findByCommentId(Long id);
    Set<Comment> getCommentByPostId(Long id);

    void deleteCommentsByPostId(Long id);
}
