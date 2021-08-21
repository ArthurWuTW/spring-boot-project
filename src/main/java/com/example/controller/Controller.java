package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.IEservice;

@RestController
public class Controller {
	
	@Autowired
	IEservice service;
	
	@GetMapping("/hello")
	public String hello() {
		return service.sayHi();
	}
	
	@PostMapping("/api/text")
	public String getTextSentimentData() {
		
		return "success";
	}
}
