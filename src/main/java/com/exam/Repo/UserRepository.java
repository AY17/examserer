package com.exam.Repo;

import com.exam.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    //to find user by username
    public User findByUsername(String username);
}
