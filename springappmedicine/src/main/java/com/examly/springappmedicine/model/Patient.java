package com.examly.springappmedicine.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Patient {
    private int patientId;
    private String firstName;
    private String lastName;
    private String gender;
    private String address;
    private String phoneNumber;
    private String email;
    private String insuranceDetails;
    private String status;
    private LocalDateTime dateOfBirth;

    public Patient(int patientId, String firstName, String lastName, String gender, String address, String phoneNumber,
            String email, String insuranceDetails, String status, LocalDateTime dateOfBirth) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.insuranceDetails = insuranceDetails;
        this.status = status;
        this.dateOfBirth = dateOfBirth;
    }

    public Patient(){}
}
