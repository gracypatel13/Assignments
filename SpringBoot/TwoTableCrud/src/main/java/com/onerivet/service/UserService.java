package com.onerivet.service;

import java.util.List;

import com.onerivet.payload.UserDto;

public interface UserService {
	
	public String addUser(UserDto dto);
	
	public List<UserDto> getAllUser();
	
	public String deleteUserById(int id);
	
	public UserDto getUserById(int id);
	
	public String updateUserById(int id,UserDto dto);
	
	 

}
