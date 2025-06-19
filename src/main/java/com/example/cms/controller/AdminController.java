package com.example.cms.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.cms.model.CourseRegistry;
import com.example.cms.model.Users;
import com.example.cms.service.CourseService;
import com.example.cms.service.UserService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	CourseService courseService;
	
	@PostMapping("/register")
	public String register(@RequestBody Users user)
	{
		return userService.register(user);
	}
	
	@GetMapping("/enrolled-students")
	public List<CourseRegistry> getStudents()
	{
		return courseService.getStudents();
	}
}
