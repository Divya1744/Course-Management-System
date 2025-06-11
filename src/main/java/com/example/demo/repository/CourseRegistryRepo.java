package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CourseRegistry;

public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer>{
	
}
