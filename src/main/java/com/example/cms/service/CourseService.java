package com.example.cms.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cms.model.Course;
import com.example.cms.model.CourseRegistry;
import com.example.cms.repository.CourseRegistryRepo;
import com.example.cms.repository.CourseRepo;

@Service
public class CourseService {

	@Autowired
	CourseRepo courseRepo;
	
	@Autowired
	CourseRegistryRepo courseRegistryRepo;
	
	public List<Course> getCourses() {
		
		return courseRepo.findAll();
	}
	public List<CourseRegistry> getStudents() {
		
		return courseRegistryRepo.findAll();
		
	}
	public String enroll(String name, String mail, String cname) {
		
		CourseRegistry courseRegistry = new CourseRegistry(name,mail,cname);
		courseRegistryRepo.save(courseRegistry);
		return "Congratulations, " + name + ", for enrolling in the " + cname + " course!"
;
	}

}
