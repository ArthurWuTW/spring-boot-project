package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.TextSentiment;
import com.example.service.IEservice;
import com.example.threading.JobManager;

@RestController
public class Controller {
	
	@Autowired
	private IEservice service;
	
	@Autowired
	private JobManager manager;
	
	@GetMapping("/hello")
	public String hello() {
		return service.sayHi();
	}
	
	@PostMapping("/api/text")
	public String getTextSentimentData(@RequestBody TextSentiment data) {
		manager.addTextSentiment(data);
		return "success";
	}
}
