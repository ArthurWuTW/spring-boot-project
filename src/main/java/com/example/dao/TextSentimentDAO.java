package com.example.dao;

import java.sql.Date;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.TextSentiment;

public class TextSentimentDAO implements ITextSentimentDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void insert(TextSentiment data) {
		data.setCt_date(new Date(System.currentTimeMillis()));
		data.setStatus("UPDATING");
		System.out.println(data.getTitle());
		sessionFactory.getCurrentSession().save(data);
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		
	}

}
