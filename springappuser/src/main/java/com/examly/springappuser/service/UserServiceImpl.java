package com.examly.springappuser.service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;

    public User register(User user){
        return userRepository.save(user);
    }

    public String login(String email, String password){
        Optional<user> user = userRepository.findAll().stream().filter(u -> u.getEmail().equals(email) && u.getPassword().equals(password)).findFirst();
        if(user.isPresent()){
            return UUID.randomUUID().toString();
        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid Credentials");
    }
}
