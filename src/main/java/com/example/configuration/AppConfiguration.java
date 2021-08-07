package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.service.Eservice;
import com.example.service.IEservice;

@Configuration
public class AppConfiguration {
	
	@Bean
	public IEservice getEservice() {
		return new Eservice();
	}
}
