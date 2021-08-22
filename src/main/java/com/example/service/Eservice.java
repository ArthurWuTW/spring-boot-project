package com.example.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.ITextSentimentDAO;
import com.example.entity.TextSentiment;
import com.example.utils.CommonDataModel;

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
		textSentimentDAO.insert(data);
	}
	
}
