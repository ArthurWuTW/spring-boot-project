package com.example.threading;

import com.example.service.IEservice;
import com.example.utils.CommonDataModel;

public class Task implements Runnable{

	private CommonDataModel data;
	private IEservice service;
	
	public Task(CommonDataModel data, IEservice service) {
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
