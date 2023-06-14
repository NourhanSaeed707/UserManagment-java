package com.example.usermanagment.service;

import com.example.usermanagment.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);


    boolean deleteUserById(Long id);

    User updateUser(Long id, User user);
}
