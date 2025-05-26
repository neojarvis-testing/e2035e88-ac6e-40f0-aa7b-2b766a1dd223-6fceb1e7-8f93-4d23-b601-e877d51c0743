package com.examly.springappmedicine.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class User {

    private int userId;
    private String email;
    private String password;
    private String username;
    private String mobileNumber;
    private String userRole;
}
