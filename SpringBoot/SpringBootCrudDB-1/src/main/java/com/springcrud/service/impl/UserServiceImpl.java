package com.springcrud.service.impl;



import java.sql.SQLException;
import java.util.List;
import java.util.Optional;import java.util.stream.Collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springcrud.entity.User;
import com.springcrud.repository.UserRepository;
import com.springcrud.service.UserService;

@Transactional
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	User user;
	
	
	public UserServiceImpl() {
		super();
	}
	
	@Override
	public String addUser(User u) {
		userRepository.save(u);
		return "Added";
	}
	
	@Override
	public List<User> allUser() {
		return userRepository.findAll();
	}
	
	@Override
	public Optional<User> getUserById(int id) {
		try {
		return userRepository.findById(id);
		}
		catch(Exception e) {
		return null;
		}
	}
	
	@Override
	public String deleteUser(int id) {
		try {
			user=userRepository.findById(id).get();
		userRepository.delete(user);
		return "Deleted";
		}
		catch(Exception e) {
			return "User Not Found";
		}
	}
	
	@Override
	public String updateUser(int id) {
		//userRepository.
		return null;
	}
	
	@Override
	public List<User> getUserByName(String name) {
		
		return userRepository.findUserByName(name);
	}

	
	

}
