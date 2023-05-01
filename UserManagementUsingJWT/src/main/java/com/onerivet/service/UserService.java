package com.onerivet.service;

import com.onerivet.payload.UserDto;

public interface UserService {
	
	public String addUser(UserDto dto);
	
	public UserDto  getUserById(int id);
	
	public void assignRole(String userName,String role);
	
	

}
