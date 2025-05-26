package com.examly.springappfeedback.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int feedBackId;

    @ManyToOne
    private User user;
    private String feedbackText;
    private LocalDateTime date;
    public Feedback(int feedBackId, User user, String feedbackText, LocalDateTime date) {
        this.feedBackId = feedBackId;
        this.user = user;
        this.feedbackText = feedbackText;
        this.date = date;
    }
    public int getFeedBackId() {
        return feedBackId;
    }
    public User getUser() {
        return user;
    }
    public String getFeedbackText() {
        return feedbackText;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setFeedBackId(int feedBackId) {
        this.feedBackId = feedBackId;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
