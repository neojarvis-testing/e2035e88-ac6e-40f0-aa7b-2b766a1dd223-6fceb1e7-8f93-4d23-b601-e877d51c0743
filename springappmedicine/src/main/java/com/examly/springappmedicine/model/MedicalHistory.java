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
public class MedicalHistory {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int medicalHistoryId;
    private String diagnosis;
    private String treatment;
    private LocalDateTime date;

    @ManyToOne
    private Patient patient;

    public MedicalHistory() {
    }
    public MedicalHistory(int medicalHistoryId, String diagnosis, String treatment, LocalDateTime date,
            Patient patient) {
        this.medicalHistoryId = medicalHistoryId;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.date = date;
        this.patient = patient;
    }
}
