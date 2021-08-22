package com.example.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.utils.CommonDataModel;

@Transactional
public class Eservice implements IEservice {
	
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public String sayHi() {
		return "hi eservice"+sessionFactory.toString();
	}

	@Override
	public void addTextSentiment(CommonDataModel data) {
		// TODO Auto-generated method stub
	}
	
}
