package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Course;
import com.example.demo.model.CourseRegistry;
import com.example.demo.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return courseService.getCourses();
	}
	
	@GetMapping("courses/enrolled")
	public List<CourseRegistry> getStudents()
	{
		return courseService.getStudents();
	}
	
	@PostMapping("courses/enroll")
	public String enroll(@RequestParam("courseName")String cname,@RequestParam("emailId")String mail,@RequestParam("name")String name)
	{
		return courseService.enroll(cname,mail,name);
	}
}
