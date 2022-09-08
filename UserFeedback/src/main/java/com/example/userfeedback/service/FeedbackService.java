package com.example.userfeedback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userfeedback.entity.Feedback;
import com.example.userfeedback.repository.FeedbackRepository;

@Service
public class FeedbackService {
	
	@Autowired
	private FeedbackRepository feedbackrepo;
	
	public boolean addFeedback( Feedback feedback) {
		feedbackrepo.save(feedback);
		return true;
	}

}
