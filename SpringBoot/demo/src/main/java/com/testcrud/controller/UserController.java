package com.testcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testcrud.model.entity.User;
import com.testcrud.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userServices;

	@PostMapping("/add")
	public String addUser(@RequestBody User user) {
		 userServices.add(user);
		 return "Saved";
	}
	
	@GetMapping("/get-all")
	public List<User> getAll(){
		return userServices.getAllUser();
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable int id) {
		return userServices.getUser(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		return userServices.delete(id);
	}
	
	@PutMapping("/update/{id}")
	public String updateUser(@PathVariable int id, @RequestBody User user) {
		return userServices.update(id, user);
	}
}
