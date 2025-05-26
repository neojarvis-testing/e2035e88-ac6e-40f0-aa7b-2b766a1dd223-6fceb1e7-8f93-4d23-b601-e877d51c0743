package com.examly.springappmedicine.controller;

@RequestController
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
