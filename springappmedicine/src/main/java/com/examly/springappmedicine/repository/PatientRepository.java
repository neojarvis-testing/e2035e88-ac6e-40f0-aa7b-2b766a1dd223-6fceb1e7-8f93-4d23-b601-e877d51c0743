package com.examly.springappmedicine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examly.springappmedicine.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{}
