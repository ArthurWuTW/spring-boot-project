package com.example.threading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.TextSentiment;
import com.example.service.IEservice;
import com.example.utils.CommonDataModel;


public class JobManager {
	
	@Autowired
	private IEservice service;
	
	private ExecutorService pool;
	
	public JobManager() {
		pool = Executors.newFixedThreadPool(1);
	}
	
	public void addTextSentiment(TextSentiment data) {
		try {
			pool.execute(new Task(data, service));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
