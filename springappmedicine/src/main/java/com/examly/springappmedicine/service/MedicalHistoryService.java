package com.examly.springappmedicine.service;

import java.util.List;

import com.examly.springappmedicine.model.MedicalHistory;

public interface MedicalHistoryService {
    MedicalHistory add(MedicalHistory medicalHistory);
    List<MedicalHistory> getByPatientId(int patientId);
}