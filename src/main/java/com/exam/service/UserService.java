package com.exam.service;


import com.exam.entity.User;
import com.exam.entity.UserRole;

import java.util.Set;

public interface UserService {

    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //find user by username
    public User getUser(String username);

    //delete user by id
    public void deleteUser(Long id);
}
