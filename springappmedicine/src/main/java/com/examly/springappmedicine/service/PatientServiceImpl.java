package com.examly.springappmedicine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.examly.springappmedicine.model.Patient;
import com.examly.springappmedicine.repository.PatientRepository;

public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository repository;

    @Override
    public List<Patient> getAllPatients() {
        return repository.findAll();
    }

    @Override
    public Patient addPatient(Patient patient) {
        return repository.save(patient);
    }

    @Override
    public Optional<Patient> getPatientById(int id) {
        return repository.findById(id);
    }

    @Override
    public Patient updatePatient(int id, Patient updated) {
        updated.setPatientId(id);
        return repository.save(updated);
    }

    @Override
    public void deletePatient(int id) {
        repository.deleteById(id);
    }
    
    
    
}
