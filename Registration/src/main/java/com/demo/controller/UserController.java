package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.TendRepo;
import com.demo.dao.UserRepo;
import com.demo.model.Tender;
import com.demo.model.User;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:4200")
public class UserController {
	
	
	@Autowired
	UserRepo userepo;
	@Autowired
	TendRepo trepo;
	
	@GetMapping("/show")
	public List<User> showUser() {
		return userepo.findAll();	
	
	}
	
	@PostMapping("/add")
	public void addUser(@RequestBody User user) {
		  userepo.save(user);
	}
//	
//	@GetMapping("/get/{email} ")
//	public List<User> getByEmail(@PathVariable String email) {
//	return	userepo.getByEmail(email);
//	}	
	
	
	@GetMapping("/get/tender")
	public List<Tender> showAll(){
		return trepo.findAll();		
	}
	
	@PostMapping("/addtender")
	public void addtender(@RequestBody Tender tender) {
		trepo.save(tender);
	}
	
}
