package com.example.configuration;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.example.entity.Person;
import com.example.service.Eservice;
import com.example.service.IEservice;

@Configuration
public class AppConfiguration {
	
	@Bean
	public IEservice getEservice() {
		return new Eservice();
	}
	
	@Bean
	public SessionFactory getSessionFactory() {
		org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
		configuration.setProperty("hibernate.hbm2ddl.auto", "update");
		configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL9Dialect");
		configuration.setProperty("hibernate.current_session_context_class", "org.springframework.orm.hibernate5.SpringSessionContext");
		configuration.setProperty("hibernate.temp.use_jdbc_metadata_defaults", "false");
		configuration.setProperty("hibernate.temp.default_schema", "public");
		configuration.addAnnotatedClass(Person.class);
		
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		DriverManagerDataSource dataSourceManager = new DriverManagerDataSource();
		dataSourceManager.setDriverClassName("org.postgresql.Driver");
		dataSourceManager.setUrl("jdbc:postgresql://10.1.1.9:5432/postgres");
		dataSourceManager.setUsername("myprojectuser");
		dataSourceManager.setPassword("myprojectuser");
		
		DataSource dataSource = dataSourceManager;
		builder.applySetting(Environment.DATASOURCE, dataSource);
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		
		return sessionFactory;
	}
}
