package com.examly.springappuser.service;

public interface UserService {
    User register(User user);
    String login(String email, String password);
}
