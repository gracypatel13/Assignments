package com.springcrud.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springcrud.entity.User;
import com.springcrud.service.UserService;
@Service
public class UserServicImpl implements UserService {
	HashMap<Integer,User> userList=new HashMap<>();
	@Override
	public String message() { 
		return "Hello World";
	}

	@Override
	public String addUser(User u) {
		userList.put(u.getId(), u);
		return "User Added";
	}

	@Override
	public List<User> getAllUser() {
		return userList.values().stream().collect(Collectors.toList());
	}

	@Override
	public User getUser(int id) {
		return userList.get(id);
	}

	@Override
	public String deleteUser(int id) {
		userList.remove(id);
		return "Deleted";
	}

	@Override
	public String updateUser(int id, User u) {
		userList.replace(id, u);
		return "Updated";
	}

}
