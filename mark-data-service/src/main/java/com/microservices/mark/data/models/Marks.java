package com.microservices.mark.data.models;

public class Marks {
	private String courseId;
	private int mark;

	public Marks() {

	}

	public Marks(String courseId, int mark) {
		super();
		this.courseId = courseId;
		this.mark = mark;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

}
