package com.examly.springappmedicine.controller;

@RequestController
@RequestMapping("/api/notifications")
public class NotificationController {
    
    @Autowired
    private NotificationService notificationService;

    @GetMapping
    public List<Notification> getAll(){
        return notificationService.getAll();
    }

    @PostMapping
    public Notification add(@RequestBody Notification notification){
        return notificationService.add(notification);
    }

    @PutMapping("/{id}")
    public Notification update(@PathVariable int id, @RequestBody Notification notification){
        return notificationService.update(id, notification);
    }

}
