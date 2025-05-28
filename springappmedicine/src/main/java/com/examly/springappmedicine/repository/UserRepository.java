package com.examly.springappmedicine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examly.springappmedicine.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

    User findByEmailAndPassword(String email, String password);}
