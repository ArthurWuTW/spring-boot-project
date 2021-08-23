package com.example.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.ITextSentimentDAO;
import com.example.entity.TextSentiment;

@Transactional(rollbackFor = {Exception.class})
public class Eservice implements IEservice {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private ITextSentimentDAO textSentimentDAO;
	
	@Override
	public String sayHi() {
		return "hi eservice"+sessionFactory.toString();
	}

	@Override
	public void addTextSentiment(TextSentiment data) {
		if(!isExist(data)) {
			textSentimentDAO.insert(data);
		}
		else {
			System.out.println("this data already exists!");
		}
	}
	
	private boolean isExist(TextSentiment data) {
		return (textSentimentDAO.findByTitle(data) != null) ? true : false;
	}
	
}
