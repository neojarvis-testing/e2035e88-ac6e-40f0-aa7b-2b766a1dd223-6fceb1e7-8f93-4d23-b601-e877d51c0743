package com.examly.springappmedicine.service;

import java.util.List;

import com.examly.springappmedicine.model.MedicalHistory;


public interface MedicalHistoryService {
    List<MedicalHistory> getAllmedicalHistories();
    MedicalHistory addMedicalHistory(MedicalHistory medicalHistory);
    MedicalHistory getMedicalHistoryById(int id);
    MedicalHistory updateMedicalHistory(int id, MedicalHistory medicalHistory);
    void deleteMedicalHistory(int id);
}