package com.example.UglyTwitter.services;

import com.example.UglyTwitter.model.Post;
import com.example.UglyTwitter.repositories.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepo postRepo;

    @Override
    public void save(Post post) {
        postRepo.save(post);
    }

    @Override
    public void delete(Post post) {
        postRepo.delete(post);
    }

    @Override
    public Post findByUserId(Long userId) {
        return postRepo.findByUserId(userId);
    }

    @Override
    public Optional<Post> findByPostId(Long postId) {
        return postRepo.findById(postId);
    }
}
