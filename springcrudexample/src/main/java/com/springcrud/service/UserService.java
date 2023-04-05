package com.springcrud.service;

import java.util.HashMap;
import java.util.List;

import com.springcrud.entity.User;

public interface UserService {
	public String message();
	public String addUser(User u);
	public List<User> getAllUser();
	public User getUser(int id);
	public String deleteUser(int id);
	public String updateUser(int id,User u);

}
