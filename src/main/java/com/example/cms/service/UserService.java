package com.example.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.cms.model.Users;
import com.example.cms.repository.UserDetailsRepo;

@Service
public class UserService {

	@Autowired
	UserDetailsRepo repo;
	
	public String register(Users user)
	{
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
		user.setPassword(encoder.encode(user.getPassword()));
		repo.save(user);
		return "registered";
	}

	public String update(Users user) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
		user.setPassword(encoder.encode(user.getPassword()));
		repo.save(user);
		return "updated";
	}
}
