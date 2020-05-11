package com.example.UglyTwitter.services;

import com.example.UglyTwitter.model.Post;
import com.example.UglyTwitter.repositories.PostRepository;
import com.example.UglyTwitter.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public void save(Post post){
        postRepository.save(post);
    }

    @Override
    public void delete(Long id) { postRepository.deleteById(id);}

    @Override
    public Post FindById (Long id){
        return postRepository.findByPostId(id);
    }
}
