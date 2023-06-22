package com.queryexample.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.queryexample.payload.UserDto;
import com.queryexample.servicee.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
private UserService userService;


	@GetMapping("/message")
	public String message(String name) {
		return "Hello"+" "+name;
		
	}

	
@PostMapping("/add")
public String addUser(@RequestBody@Valid UserDto dto) {
	System.out.println(dto.getLastName());
	return userService.addUser(dto);
}

@GetMapping("/all")
public List<UserDto> allUser() {
	return userService.allUser();
	
}



@GetMapping("/getuser/id/{id}")
public UserDto getUserById(@PathVariable int id) {
	return userService.getUserById(id);
}

@DeleteMapping("/deleteuser/{id}")
public String deleteUserById(@PathVariable int id) {
	return userService.deleteUserById(id);
}






}
