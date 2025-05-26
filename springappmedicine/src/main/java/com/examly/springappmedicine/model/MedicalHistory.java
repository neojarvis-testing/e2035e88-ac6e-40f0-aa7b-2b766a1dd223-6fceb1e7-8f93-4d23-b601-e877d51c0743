package com.examly.springappmedicine.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MedicalHistory {
    
    private int medicalHistoryId;
    private String diagnosis;
    private String treatment;
    private LocalDateTime date;
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
