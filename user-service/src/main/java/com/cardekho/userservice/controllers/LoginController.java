package com.cardekho.userservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@Value("${spring.datasource.username: Super Admin}")
	private String userName;

	@GetMapping("/greet")
	public String greet() {
		return "Hello " + userName;
	}

}
