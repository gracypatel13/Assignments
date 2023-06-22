package com.springcrud.service;

import java.util.List;
import java.util.Optional;

import com.springcrud.entity.User;
import com.springcrud.repository.UserRepository;


public interface UserService {
	
	public String addUser(User u);
	public List<User> allUser();
	public Optional<User> getUserById(int id);
	public String deleteUser(int id);
	public String updateUser(int id);
	public List<User> getUserByName(String name);
	
}
