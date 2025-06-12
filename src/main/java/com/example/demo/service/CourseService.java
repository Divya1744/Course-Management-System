package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Course;
import com.example.demo.model.CourseRegistry;
import com.example.demo.repository.CourseRegistryRepo;
import com.example.demo.repository.CourseRepo;

@Service
public class CourseService {

	@Autowired
	CourseRepo courseRepo;
	
	@Autowired
	CourseRegistryRepo courseRegistryRepo;
	
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseRepo.findAll();
	}
	public List<CourseRegistry> getStudents() {
		
		return courseRegistryRepo.findAll();
		
	}
	public String enroll(String name, String mail, String cname) {
		// TODO Auto-generated method stub
		CourseRegistry courseRegistry = new CourseRegistry(name,mail,cname);
		courseRegistryRepo.save(courseRegistry);
		return "Congratulations, " + name + ", for enrolling in the " + cname + " course!"
;
	}

}
