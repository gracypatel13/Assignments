package com.onerivet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onerivet.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/message")
	public String message() {
		return "In the user api";
	}

}
