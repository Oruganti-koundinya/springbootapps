package com.example.userfeedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userfeedback.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer>{

}
