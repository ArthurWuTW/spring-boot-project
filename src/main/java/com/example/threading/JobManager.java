package com.example.threading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.example.utils.CommonDataModel;


public class JobManager {
	
	LinkedList<CommonDataModel> queue = new LinkedList<>();
	
	public void enqueue(CommonDataModel data) {
		queue.add(data);
	}
	
	public void start() {
		
	}
}
