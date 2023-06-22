package com.testcrud.services;

import java.util.List;

import com.testcrud.model.dto.UserDto;
import com.testcrud.model.entity.User;

public interface UserService {

	User add(User user);

	List<User> getAllUser();

	User getUser(int id);

	String delete(int id);

	String update(int id, User user);
	
	UserDto add(UserDto dto);

}
