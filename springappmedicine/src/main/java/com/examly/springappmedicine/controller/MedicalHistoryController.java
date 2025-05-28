package com.examly.springappmedicine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springappmedicine.model.MedicalHistory;
import com.examly.springappmedicine.service.MedicalHistoryService;

@RestController
@RequestMapping("/api/medical-history")
public class MedicalHistoryController {
    
    @Autowired
    private MedicalHistoryService medicalHistoryService;

    @GetMapping
    public List<MedicalHistory> getAll(){
        return patientService.getAll();
    }

    @PostMapping
    public MedicalHistory add(@RequestBody MedicalHistory mh){
        return medicalHistoryService.add(mh);
    }

    @GetMapping("/{Id}")
    public MedicalHistory get(@PathVariable int patientIdd){
        return medicalHistoryService.getByPatientId(patientId);
    }

    @PutMapping("/{id}")
    public MedicalHistory update(@PathVariable int id, @RequestBody MedicalHistory mh){
        return medicalHistoryService.update(id, mh);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        medicalHistoryService.delete(id);
    }

}
