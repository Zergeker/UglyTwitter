package com.example.UglyTwitter.repositories;

import com.example.UglyTwitter.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Comment findByCommentId(Long id);

    void deleteCommentsByPostId(Long id);
}
