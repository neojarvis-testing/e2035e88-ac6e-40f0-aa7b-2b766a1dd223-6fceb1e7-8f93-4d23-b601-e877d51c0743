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

import com.examly.springappmedicine.model.VitalSign;
import com.examly.springappmedicine.service.VitalSignService;

@RestController
@RequestMapping("/api/vitals")
public class VitalSignController {
    
    @Autowired
    private VitalSignService vitalSignService;

    @GetMapping
    public List<VitalSign> getAll(){
        return vitalSignService.getAll();
    }

    @PostMapping
    public VitalSign add(@RequestBody VitalSign vs){
        return vitalSignService.add(vs);
    }

    @GetMapping("/{id}")
    public VitalSign get(@PathVariable int id){
        return vitalSignService.get(id);
    }

    @PutMapping("/{id}")
    public VitalSign update(@PathVariable int id, @RequestBody VitalSign vs){
        return vitalSignService.update(id, vs);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        vitalSignService.delete(id);
    }
}
