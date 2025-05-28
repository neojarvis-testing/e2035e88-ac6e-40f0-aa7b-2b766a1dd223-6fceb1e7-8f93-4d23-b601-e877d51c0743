package com.examly.springappuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examly.springappuser.model.User;

public interface UserRepo extends JpaRepository<User,Integer> {
    User findByEmail(String email);

    // public Object findAll() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    // }

    // public User save(User user) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'save'");
    // }
    
}
