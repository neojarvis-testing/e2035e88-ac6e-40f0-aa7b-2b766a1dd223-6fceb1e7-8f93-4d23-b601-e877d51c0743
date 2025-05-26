package com.examly.springappmedicine.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int notificationId;
    private String message;
    private boolean isRead;
    private LocalDateTime createAt;

    @ManyToOne
    private User user;

    @ManyToOne
    private VitalSign vitalSign;

    @ManyToOne
    private MedicalHistory MedicalHistory;

    @ManyToOne
    private Patient patient;
    public Notification(int notificationId, String message, boolean isRead, LocalDateTime createAt, User user,
            VitalSign vitalSign, com.examly.springappmedicine.model.MedicalHistory medicalHistory, Patient patient) {
        this.notificationId = notificationId;
        this.message = message;
        this.isRead = isRead;
        this.createAt = createAt;
        this.user = user;
        this.vitalSign = vitalSign;
        MedicalHistory = medicalHistory;
        this.patient = patient;
    }
}