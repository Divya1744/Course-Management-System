package com.example.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cms.model.Course;

public interface CourseRepo extends JpaRepository<Course,String> {
	
}
