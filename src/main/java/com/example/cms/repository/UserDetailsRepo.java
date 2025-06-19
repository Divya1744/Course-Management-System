package com.example.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cms.model.Users;

@Repository
public interface UserDetailsRepo extends JpaRepository<Users,Integer>{
	Users getByUsername(String username);
}
