package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

public class ContextHelper {
	
	@Autowired
	static private IEservice eservice;
	
	static public IEservice getEservice() {
		return eservice;
	}
}
