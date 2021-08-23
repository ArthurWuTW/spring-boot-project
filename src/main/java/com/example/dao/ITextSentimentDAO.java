package com.example.dao;

import com.example.entity.TextSentiment;

public interface ITextSentimentDAO {
	public void insert(TextSentiment data);
	public TextSentiment findByTitle(TextSentiment data);
}
