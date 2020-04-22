package com.example.UglyTwitter.repositories;

import com.example.UglyTwitter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
    User findByuserName(String userName);
}
