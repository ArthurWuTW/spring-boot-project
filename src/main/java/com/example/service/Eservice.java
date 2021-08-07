package com.example.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class Eservice implements IEservice {
	
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public String sayHi() {
		return "hi eservice"+sessionFactory.toString();
	}
	
}
