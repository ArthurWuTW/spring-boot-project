package com.example.threading;

import com.example.entity.TextSentiment;
import com.example.service.IEservice;

public class Task implements Runnable{

	private TextSentiment data;
	private IEservice service;
	
	public Task(TextSentiment data, IEservice service) {
		this.data = data;
		this.service = service;
	}
	
	@Override
	public void run() {
		try {
			service.addTextSentiment(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
