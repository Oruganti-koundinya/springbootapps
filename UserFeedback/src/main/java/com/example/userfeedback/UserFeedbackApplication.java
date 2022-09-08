package com.example.userfeedback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.userfeedback")

@EntityScan(basePackages = "com.example.userfeedback")
@EnableJpaRepositories(basePackages = "com.example.userfeedback")
public class UserFeedbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserFeedbackApplication.class, args);
	}

}
