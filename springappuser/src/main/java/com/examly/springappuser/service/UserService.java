package com.examly.springappuser.service;

import com.examly.springappuser.model.User;

public interface UserService {
    User register(User user);
    String login(String email, String password);
}
