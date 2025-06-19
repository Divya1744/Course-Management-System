package com.example.cms.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.cms.model.Course;
import com.example.cms.service.CourseService;

@RestController
@CrossOrigin(origins=("http://127.0.0.1:5500"))
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping("/home")
	public String home()
	{
		return "home page";
	}
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return courseService.getCourses();
	}
	
	@PostMapping("courses/enroll")
	public String enroll(@RequestParam("name")String name,@RequestParam("emailId")String mail,@RequestParam("courseName")String cname)
	{
		return courseService.enroll(name,mail,cname);
	}
}
