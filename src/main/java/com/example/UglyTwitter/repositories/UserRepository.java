package com.example.UglyTwitter.repositories;

import com.example.UglyTwitter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository <User, Long> {

    @Query("SELECT user FROM users where user.user_name = :userName")
    User findByUserName(@Param("userName") String userName);
}
