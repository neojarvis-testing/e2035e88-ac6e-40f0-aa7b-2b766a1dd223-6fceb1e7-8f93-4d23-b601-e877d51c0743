package com.examly.springappmedicine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springappmedicine.model.MedicalHistory;
import com.examly.springappmedicine.repository.MedicalHistoryRepository;

@Service
public class MedicalHistoryServiceImpl implements MedicalHistoryService {

    @Autowired
    private MedicalHistoryRepository repository;

    @Override
    public MedicalHistory addMedicalHistory(MedicalHistory medicalHistory) {
        return repository.save(medicalHistory);
    }

    @Override
    public MedicalHistory getMedicalHistoryById(int id) {
       return repository.findById(id).orElseThrow(()->  
       new RuntimeException("Medical History not found: "+id));
    }

    public List<MedicalHistory> getAllmedicalHistories(){
        return repository.findAll();
    }

    public MedicalHistory updateMedicalHistory(int id, MedicalHistory updated){
        updated.setMedicalHistoryId(id);
        return repository.save(updated);
    }

    public void deleteMedicalHistory(int id){
        repository.deleteById(id);
    }
    
}
