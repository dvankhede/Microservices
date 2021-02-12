package com.microservices.student.catalog.models;

import java.util.List;

public class StudentMarks {

	private String userId;
	private List<Marks> marks;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<Marks> getMarks() {
		return marks;
	}
	public void setMarks(List<Marks> marks) {
		this.marks = marks;
	}
	
	
}
