package com.examly.springappuser.service;

import java.util.UUID;

import org.apache.hc.core5.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.examly.springappuser.model.User;
import com.examly.springappuser.repository.UserRepo;
import com.google.common.base.Optional;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepo userRepository;

    public User register(User user){
        return userRepository.save(user);
    }

    public String login(String email, String password){
        Optional<User> user = userRepository.findAll().stream().filter(u -> u.getEmail().equals(email) && u.getPassword().equals(password)).findFirst();
        if(user.isPresent()){
            return UUID.randomUUID().toString();
        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid Credentials");
    }
}
