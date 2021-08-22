package com.example.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="TEXT_SENTIMENT", schema = "public")
public class TextSentiment implements Serializable {
	
	@Id
	@Column
	private Integer id;
	
	@Column(length = 64)
	private String searchText;
	
	@Column(length = 1000)
	private String title;
	
	@Column
	private String is_transcript;
	
	@Lob
	private String text;
	
	@Column
	private Float score;
	
	@Column
	private Date ct_date;
	
	@Column
	private Date dt_date;
	
	@Column
	private String status;
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setCt_date(Date ct_date) {
		this.ct_date = ct_date;
	}
	
	public void setDt_date(Date dt_date) {
		this.dt_date = dt_date;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setIs_transcript(String is_transcript) {
		this.is_transcript = is_transcript;
	}
	
	public void setScore(Float score) {
		this.score = score;
	}
	
	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Date getCt_date() {
		return ct_date;
	}
	
	public Date getDt_date() {
		return dt_date;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getIs_transcript() {
		return is_transcript;
	}
	
	public Float getScore() {
		return score;
	}
	
	public String getSearchText() {
		return searchText;
	}
	
	public String getText() {
		return text;
	}
	
	public String getTitle() {
		return title;
	}
}
