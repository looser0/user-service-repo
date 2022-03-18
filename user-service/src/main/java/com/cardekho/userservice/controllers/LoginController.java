package com.cardekho.userservice.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cardekho.userservice.model.User;
import com.cardekho.userservice.service.UserService;

@RestController
public class LoginController {

	@Value("${spring.datasource.username: Super Admin}")
	private String userName;

	@Autowired
	private UserService userService;
	
	private static final Logger logger = LogManager.getLogger(LoginController.class);
	
	@GetMapping("/greet")
	public String greet() {
		logger.info("Inside greet method of LoginController class started...");
		User user = new User();
		userService.findById(100);
		return "Hello " + userName;
	}

}
