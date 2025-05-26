package com.examly.springappfeedback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springappfeedback.model.Feedback;
import com.examly.springappfeedback.service.FeedbackService;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {
    
    @Autowired
    private FeedbackService feedbackService;

    @PostMapping
    public ResponseEntity<Feedback> addFeedback(@RequestBody Feedback feedback){
        return new ResponseEntity<>(feedbackService.addFeedback(feedback), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Feedback>> getAllFeedback(){
        return ResponseEntity.ok(feedbackService.getAllFeedback());
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Feedback>> getFeedbackByUserId(@PathVariable int userId){
        return ResponseEntity.ok(feedbackService.getFeedbackByUserId(userId));
    }

    @DeleteMapping("/user/{userId}")
    public ResponseEntity<List<Feedback>> getFeedbackByUserId(@PathVariable int userId){
        return ResponseEntity.ok(feedbackService.getFeedbackByUserId(userId));
    }
    public void deleteFeedback(@PathVariable int feedBackId){
        feedbackService.deleteFeedback(feedBackId);
    }
}
