package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	public List<User> findByEmail(String email);
	
	

}
