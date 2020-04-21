package com.example.UglyTwitter.repo;

import java.util.List;

import com.example.UglyTwitter.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {

    List<User> findByUserName(String lastName);

    User findById(long id);
}