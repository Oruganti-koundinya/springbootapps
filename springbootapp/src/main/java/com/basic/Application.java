package com.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Application {
	
	@GetMapping("/")
	public String Message() {
		return "Welcome Spring Boot Application on AWS Cloud";
	}
}