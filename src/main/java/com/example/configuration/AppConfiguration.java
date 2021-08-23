package com.example.configuration;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import com.example.dao.ITextSentimentDAO;
import com.example.dao.TextSentimentDAO;
import com.example.entity.TextSentiment;
import com.example.service.Eservice;
import com.example.service.IEservice;
import com.example.threading.JobManager;

@Configuration
public class AppConfiguration {
	
	@Bean
	public IEservice getEservice() {
		return new Eservice();
	}
	
	@Bean ITextSentimentDAO getTextSentimentDAO() {
		return new TextSentimentDAO();
	}
	
	@Bean
	public SessionFactory getSessionFactory() {
		org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
		configuration.setProperty("hibernate.hbm2ddl.auto", "none");
		configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL9Dialect");
		configuration.setProperty("hibernate.current_session_context_class", "org.springframework.orm.hibernate5.SpringSessionContext");
		configuration.setProperty("hibernate.temp.use_jdbc_metadata_defaults", "false");
		configuration.addAnnotatedClass(TextSentiment.class);
		
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		DriverManagerDataSource dataSourceManager = new DriverManagerDataSource();
		dataSourceManager.setDriverClassName("org.postgresql.Driver");
		dataSourceManager.setUrl("jdbc:postgresql://172.17.0.2:5432/postgres");
		dataSourceManager.setUsername("myprojectuser");
		dataSourceManager.setPassword("myprojectuser");
		
		DataSource dataSource = dataSourceManager;
		builder.applySetting(Environment.DATASOURCE, dataSource);
		builder.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		
		return sessionFactory;
	}
	
	@Bean
	public HibernateTransactionManager getTransactionManager(@Qualifier("getSessionFactory") SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactory);
		return transactionManager;
	}
	
	@Bean
	public JobManager getJobManager() {
		return new JobManager();
	}
}
