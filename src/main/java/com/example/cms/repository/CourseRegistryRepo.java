package com.example.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cms.model.CourseRegistry;

public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer>{
	
}
