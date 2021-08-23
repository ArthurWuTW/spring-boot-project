package com.example.dao;

import java.sql.Date;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.TextSentiment;

import antlr.collections.List;

public class TextSentimentDAO implements ITextSentimentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insert(TextSentiment data) {
		data.setCt_date(new Date(System.currentTimeMillis()));
		data.setStatus("ACCEPT");
		System.out.println(data.getTitle());
		sessionFactory.getCurrentSession().save(data);
	}

	@Override
	public TextSentiment findByTitle(TextSentiment data) {
		return (TextSentiment) sessionFactory.getCurrentSession()
				.createQuery("FROM TextSentiment WHERE Title = :title").setParameter("title", data.getTitle()).uniqueResult();

	}

}
