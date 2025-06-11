package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	private String course_id;
	private String name;
	private int duration_in_weeks;
	private String trainer;
	
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration_in_weeks() {
		return duration_in_weeks;
	}
	public void setDuration_in_weeks(int duration_in_weeks) {
		this.duration_in_weeks = duration_in_weeks;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	
}
