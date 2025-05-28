package com.examly.springappmedicine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springappmedicine.model.Notification;
import com.examly.springappmedicine.service.NotificationService;

@RestController
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
