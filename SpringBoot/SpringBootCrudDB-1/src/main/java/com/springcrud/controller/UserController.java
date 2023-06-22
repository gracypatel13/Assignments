package com.springcrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcrud.entity.User;
import com.springcrud.service.UserService;
import com.springcrud.service.impl.UserServiceImpl;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public String addUser(User u) {
		return userService.addUser(u);
	}
	
	@GetMapping("/all")
	public List<User> allUser(){
		return userService.allUser();
	}
	
	@GetMapping("/getuser/{id}")
	public Optional<User> getUserById(@PathVariable int id) {
		//User u=userService.getUserById(id).get();
		System.out.println(userService.getUserById(id).get());
		try {
		return userService.getUserById(id);
		}
		catch(Exception e) {
			return null;
		}
		
	}

	@DeleteMapping("/deleteuser/{id}")
	public String deleteUserById(@PathVariable int id) {
		return userService.deleteUser(id);
		
	}
	
	@GetMapping("/getuserbyname")
	public List<User> findUserByName(String name){
		return userService.getUserByName(name);
	}
	
}
