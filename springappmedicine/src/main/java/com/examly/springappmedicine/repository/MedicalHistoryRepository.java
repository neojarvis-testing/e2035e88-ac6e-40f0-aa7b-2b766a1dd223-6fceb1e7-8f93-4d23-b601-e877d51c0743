package com.examly.springappmedicine.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.examly.springappmedicine.model.MedicalHistory;

public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory, Integer>{
    List<MedicalHistory> findByPatientId(int patientId);
}


