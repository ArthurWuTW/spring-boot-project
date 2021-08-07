package com.example.entity;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Training_Person")
public class Person implements Serializable {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "ct_date")
	private Time ct_date;
	
	public Integer getId() {
		return id;
	}
	
	public Person() {
		
	}
	
	public void setCt_date(Time ct_date) {
		this.ct_date = ct_date;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Time getCt_date() {
		return ct_date;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
}
