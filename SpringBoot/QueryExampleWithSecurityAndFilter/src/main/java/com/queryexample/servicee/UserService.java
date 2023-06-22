package com.queryexample.servicee;

import java.util.List;
import java.util.Map;

import com.queryexample.payload.UserDto;

public interface UserService {
	
	

	public String addUser(UserDto dto);
	
	public List<UserDto> allUser();
	
	public UserDto getUserById(int id);
	
	public String deleteUserById(int id);
	
	
	



}
