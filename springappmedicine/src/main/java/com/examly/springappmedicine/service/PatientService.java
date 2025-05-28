package com.examly.springappmedicine.service;

import java.util.List;
import java.util.Optional;

import com.examly.springappmedicine.model.Patient;

public interface PatientService {
    List<Patient> getAllPatients();
    Patient addPatient(Patient patient);
    Optional<Patient> getPatientById(int id);
    Patient updatePatient(int id, Patient patient);
    void deletePatient(int id);
}
