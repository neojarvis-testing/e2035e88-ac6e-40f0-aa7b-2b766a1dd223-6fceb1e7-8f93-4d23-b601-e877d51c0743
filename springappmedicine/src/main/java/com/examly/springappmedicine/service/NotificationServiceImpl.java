package com.examly.springappmedicine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springappmedicine.model.Notification;
import com.examly.springappmedicine.repository.NotificationRepository;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationRepository repository;

    public List<Notification> getAllNotifications(){
        return repository.findAll();
    }

    public Notification addNotification(Notification notification){
        return repository.save(notification);
    }

    public Notification updateNotification(int id, Notification notification){
        notification.setNotificationId(id);
        return repository.save(notification);
    }
}
