package com.onerivet.controller;

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

import com.onerivet.payload.UserDto;
import com.onerivet.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/adduser")
	public String addUser(@RequestBody UserDto dto) {
		return userService.addUser(dto);
		
	}
	
	@GetMapping("/alluser")
	public List<UserDto> getAllUser(){
		return userService.getAllUser();
	}
	
	@DeleteMapping("/deleteuser/{id}")
	public String deleteUserById(@PathVariable int id) {
		return userService.deleteUserById(id);
	}
	
	@GetMapping("/getuser/{id}")
	public UserDto getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	
	@PutMapping("/updateuser/{id}")
	public String updateUserById(@PathVariable int id,@RequestBody UserDto dto) {
		return userService.updateUserById(id, dto);
	}
	


}
