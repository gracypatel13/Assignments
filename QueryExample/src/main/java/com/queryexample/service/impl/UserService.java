package com.queryexample.service.impl;

import java.util.List;

import com.queryexample.entity.User;
import com.queryexample.payload.UserDto;

public interface UserService {
	
	//public String addUser(User u);

	public String addUser(UserDto dto);
	
	public List<UserDto> allUser();
	
	public UserDto getUserById(int id);
	
	public String deleteUserById(int id);
	
	public String deleteAllUser();
	
	public List<UserDto> getUserByFirstName(String name);
	
	public List<UserDto> getUserByLastName(String name);

	


}
