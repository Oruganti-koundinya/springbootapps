package com.example.quizportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.example.quizportal")
@EntityScan(basePackages = "com.example.quizportal.entity")
public class QuizportalApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizportalApplication.class, args);
		System.out.println("Quiz Portal Started");
	}
}