package com.examly.springappmedicine.controller;

@RequestController
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

    @GetMapping("/{id}")
    public MedicalHistory get(@PathVariable int id){
        return medicalHistoryService.get(id);
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
