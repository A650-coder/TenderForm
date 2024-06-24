//package com.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.demo.model.User;
//
//import com.service.LoginService;
//
//@RestController
//@RequestMapping("/user")
//@CrossOrigin(origins="http://localhost:4200")
//public class LoginController {
//	
//	@Autowired
//    LoginService loginService;
//	//LoginValidation
//	  @PostMapping("/userlogin")
//	    public int login(@RequestBody User user) {
//	        String email = user.getEmail();
//	        String password = user.getPassword();
//	        
//		return loginService.loginValidation(email, password);
//			
//	    }
//
//}
