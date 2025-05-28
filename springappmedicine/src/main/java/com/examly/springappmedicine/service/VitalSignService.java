package com.examly.springappmedicine.service;

import java.util.List;
import java.util.Optional;

import com.examly.springappmedicine.model.VitalSign;

public interface VitalSignService {
    List<VitalSign> getAllVitalSigns();
    VitalSign addVitalSign(VitalSign vitalSign);
    Optional<VitalSign> getVitalSignById(int id);
    VitalSign updateVitalSign(int id, VitalSign vitalSign);
    void deleteVitalSign(int id);
    
}
