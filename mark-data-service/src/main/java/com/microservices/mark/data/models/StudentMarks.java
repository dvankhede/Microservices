package com.microservices.mark.data.models;

import java.util.Arrays;
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
	
	public void initData(String userId) {
        this.setUserId(userId);
        this.setMarks(Arrays.asList(
                new Marks("1", 78),
                new Marks("2", 88)
        ));
    }
}
