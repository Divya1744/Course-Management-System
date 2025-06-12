package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Course;
import com.example.demo.model.CourseRegistry;
import com.example.demo.service.CourseService;

@RestController
@CrossOrigin(origins=("http://127.0.0.1:5500"))
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
	public String enroll(@RequestParam("name")String name,@RequestParam("emailId")String mail,@RequestParam("courseName")String cname)
	{
		return courseService.enroll(name,mail,cname);
	}
}
