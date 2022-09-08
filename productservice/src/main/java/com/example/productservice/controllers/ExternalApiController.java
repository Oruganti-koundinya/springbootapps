package com.example.productservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExternalApiController {

	@RequestMapping("/weather")
	public String getWeather(@RequestParam("city") String city) {
		String url = "http://api.weatherstack.com/current?access_key=eea22105e1a0ba78540282a2733a94e8&query="+city;
		RestTemplate restTemplate = new RestTemplate();
		String weatherData = restTemplate.getForObject(url, String.class);
		return weatherData;
	}
	
}