package com.examly.springappmedicine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.examly.springappmedicine.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Integer>{}
