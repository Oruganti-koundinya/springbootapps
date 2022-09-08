package com.example.userfeedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.userfeedback.entity.Feedback;
import com.example.userfeedback.service.FeedbackService;

@RestController
public class FeedbackApplication {
	
	@Autowired
	private FeedbackService feedbackservice;
	
	@PostMapping("/feedback")
	public String userRegister(@RequestParam("emailid") String emailid,  @RequestParam("rating") String rating , @RequestParam("feedback") String feedback) {
	Feedback f = new Feedback(emailid, rating,feedback);
	boolean data= feedbackservice.addFeedback(f);
	if(data) {
		return "Feedback added succesfully!";
	}
	else {
		return "Error in Adding Feedback";
	}
		
	}

}
