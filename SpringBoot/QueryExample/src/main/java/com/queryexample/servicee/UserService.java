package com.queryexample.servicee;

import java.util.List;
import java.util.Map;

import com.queryexample.payload.UserDto;

public interface UserService {
	
	//public String addUser(User u);

	public String addUser(UserDto dto);
	
	public List<UserDto> allUser(int pageSize,int pageNumber,String sortBy);
	
	public UserDto getUserById(int id);
	
	public String deleteUserById(int id);
	
	public String deleteAllUser();
	
	public List<UserDto> getUserByFirstName(String name);
	
	public List<UserDto> getUserByLastName(String name);
	
	public List<String>  allUserFirstName();
	
	public List<UserDto>  allUserCity(String city);
	
	public List<String>  allUserPhoneNumber();
	
	public List<UserDto> allUserAboveAge();
	
	public List<UserDto> userByStatusAndCity(String city,int status);
	
	public List<String> userFirstLastNameByCity(String city);
	
	public List<Map<String, String>> userByFirstNameAndLastName(String city);

	


}
