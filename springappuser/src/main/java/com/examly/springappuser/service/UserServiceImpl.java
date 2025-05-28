package com.examly.springappuser.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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

    public String login(String email, String password) {
        User tempUser = userRepository.findByEmail(email);
        if(tempUser != null){
            if(tempUser.getPassword().equals(password))
            {
                return UUID.randomUUID().toString();
            }
            else{
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid Credentials");
            }
            
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"USER not Found");
        }
        
    }
}
