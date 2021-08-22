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
//		manager.addTextSentiment(null);
		System.out.println(data.getTitle());
		System.out.println(data.getText());
		System.out.println(data.getSearchText());
		System.out.println(data.getIs_transcript());
		System.out.println(data.getText());
		System.out.println(data.getScore());
		System.out.println(data.getStatus());
		return "success";
	}
}
