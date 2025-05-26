package com.examly.springappfeedback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springappfeedback.model.Feedback;
import com.examly.springappfeedback.repository.FeedbackRepository;
@Service
public class FeedbackServiceImpl implements FeedbackService{
    
    @Autowired
    private FeedbackRepository feedbackRepo;

    @Override
    public Feedback addFeedback(Feedback feedback){
        return feedbackRepo.save(feedback);
    }

    @Override
    public List<Feedback> getAllFeedback() {
        return feedbackRepo.findAll();
    }

    @Override
    public List<Feedback> getFeedbackByUserId(int userId) {
        return feedbackRepo.findByUserId(userId);
    }

    
}
