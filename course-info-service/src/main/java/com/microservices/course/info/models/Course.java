package com.microservices.course.info.models;

public class Course {

	private String courseId;
	private String name;
	private String description;
	private String new_feature;
	private String master;
	private String new_feature_new;
	private String new_feature_pr;
	private String master_pr;
	private String before_amend;
	private String after_amend;

	public Course() {

	}

	public Course(String courseId, String name, String description) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.description = description;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}

