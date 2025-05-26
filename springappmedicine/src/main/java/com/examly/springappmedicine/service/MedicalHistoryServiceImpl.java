package com.examly.springappmedicine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.examly.springappmedicine.model.MedicalHistory;
import com.examly.springappmedicine.repository.MedicalHistoryRepository;

public class MedicalHistoryServiceImpl implements MedicalHistoryService {

    @Autowired
    private MedicalHistoryRepository repository;

    @Override
    public MedicalHistory add(MedicalHistory medicalHistory) {
        return repository.save(medicalHistory);
    }

    @Override
    public List<MedicalHistory> getByPatientId(int patientId) {
       return repository.findByPatientId(patientId);
    }
    
}
