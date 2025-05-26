package com.examly.springappmedicine.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.examly.springappmedicine.model.VitalSign;

public interface VitalSignRepository extends JpaRepository<VitalSign, Integer>{
    List<VitalSign> findByPatientId(int patientId);
}
