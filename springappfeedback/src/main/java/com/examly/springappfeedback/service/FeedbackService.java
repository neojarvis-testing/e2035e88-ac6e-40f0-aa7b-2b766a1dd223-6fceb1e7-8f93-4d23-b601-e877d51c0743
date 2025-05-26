package com.examly.springappfeedback.service;

import java.util.List;
import com.examly.springappfeedback.model.Feedback;

public interface FeedbackService {
    Feedback addFeedback(Feedback feedback);
    List<Feedback> getAllFeedback();
    List<Feedback> getFeedbackByUserId(int userId);
    void deleteFeedback(int feedBackId);
}
