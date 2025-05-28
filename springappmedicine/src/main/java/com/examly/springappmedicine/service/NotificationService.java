package com.examly.springappmedicine.service;

import java.util.List;

import com.examly.springappmedicine.model.Notification;

public interface NotificationService {
    List<Notification> getAllNotifications();
    Notification addNotification(Notification notification);
    Notification updateNotification(int id, Notification notification);

}
