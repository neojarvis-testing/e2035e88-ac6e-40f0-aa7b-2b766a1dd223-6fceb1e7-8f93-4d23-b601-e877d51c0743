package com.examly.springappmedicine.service;

import java.util.List;
import java.util.Optional;

import com.examly.springappmedicine.model.User;

public interface UserService {
    User login(String email, String password);
    User register(User user);
    List<User> getAllUsers();
    Optional<User> getUserById(int id);
}
