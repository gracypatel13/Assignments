package com.queryexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.queryexample.entity.User;
import com.queryexample.payload.UserDto;
import com.queryexample.service.impl.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
private UserService userService;


@PostMapping("/add")
public String addUser(UserDto dto) {
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

@DeleteMapping("/delete/all")
public String deleteAllUser() {
	return userService.deleteAllUser();
}

@GetMapping("/getuser/firstname")
public List<UserDto> getUserByFirstName(@RequestParam String name){
	return userService.getUserByFirstName(name);
}

@GetMapping("/getuser/lastname")
public List<UserDto> getUserByLastName(@RequestParam String name){
	return userService.getUserByLastName(name);
}

}
