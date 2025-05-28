package com.examly.springappmedicine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.examly.springappmedicine.model.VitalSign;
import com.examly.springappmedicine.repository.VitalSignRepository;

public class VitalSignServiceImpl implements VitalSignService {

    @Autowired
    private VitalSignRepository repository;

    @Override
    public List<VitalSign> getAllVitalSigns() {
        return repository.findAll();
    }

    @Override
    public VitalSign addVitalSign(VitalSign vitalSign) {
        return repository.save(vitalSign);
    }

    @Override
    public Optional<VitalSign> getVitalSignById(int id) {
        return repository.findById(id);
    }

    @Override
    public VitalSign updateVitalSign(int id, VitalSign vitalSign) {
        vitalSign.setVitalSignId(id);
        return repository.save(vitalSign);
    }

    @Override
    public void deleteVitalSign(int id) {
        repository.deleteById(id);
    }
    
}
