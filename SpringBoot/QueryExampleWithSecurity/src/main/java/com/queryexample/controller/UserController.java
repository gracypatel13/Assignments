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


@PostMapping("/add")
public String addUser(@RequestBody@Valid UserDto dto) {
	System.out.println(dto.getLastName());
	return userService.addUser(dto);
}

@GetMapping("/all")
public List<UserDto> allUser() {
	return userService.allUser();
	
}

//@GetMapping("/all/firstname")
//public List<String> getAllByFirstName(){
//	return userService.allUserFirstName();
//}

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

//@GetMapping("/getuser/firstname")
//public List<UserDto> getUserByFirstName( String firstname){
//	return userService.getUserByFirstName(firstname);
//}
//
//@GetMapping("/getuser/lastname")
//public List<UserDto> getUserByLastName(String lastname){
//	return userService.getUserByLastName(lastname);
//}
//
//@GetMapping("/getall/18")
//public List<UserDto> getAllUserAboveAge(){
//	return userService.allUserAboveAge();
//}
//@GetMapping("/cityandstatus")
//public List<UserDto> getAllUserCityStatus(@RequestParam String city,@RequestParam int status){
//	return userService.userByStatusAndCity(city, status);
//}
//
//@GetMapping("/namebycity")
//public List<String> getNameByCity(@RequestParam String city) {
//	
//	return userService.userFirstLastNameByCity(city);
//	//return userService.().stream().collect(Collectors.toList());
//}
//
//@GetMapping("/list")
//public List<Map<String,String>> getUserByCity(String city){
//	List<Map<String,String>> list = this.userService.userByFirstNameAndLastName(city);
//	return list;
//	
//}


}
