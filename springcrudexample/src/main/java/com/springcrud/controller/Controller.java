package com.springcrud.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springcrud.entity.User;
import com.springcrud.service.UserService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/user")
public class Controller {
	
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/adduser")
	public String addUser(User u) {
		return userService.addUser( u);
	}
	
	@GetMapping("/alluser")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable int id) {
		return userService.getUser( id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		return userService.deleteUser( id);
	}
	
	@PutMapping("/update/{id}")
	public String updateUser(@PathVariable int id,@RequestBody User u) {
		return userService.updateUser(id, u);
	}

}
