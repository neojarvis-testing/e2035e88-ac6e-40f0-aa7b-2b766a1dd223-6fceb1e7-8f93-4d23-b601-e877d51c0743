package com.examly.springappmedicine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springappmedicine.model.User;
import com.examly.springappmedicine.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;

    @Override
    public User login(String email, String password) {
        return repository.findByEmailAndPassword(email,password);
    }

    @Override
    public User register(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public Optional<User> getUserById(int id) {
        return repository.findById(id);
    }
    
}
