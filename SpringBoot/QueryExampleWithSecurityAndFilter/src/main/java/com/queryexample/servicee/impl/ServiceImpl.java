package com.queryexample.servicee.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.queryexample.repositories.UserRepository;
import com.queryexample.servicee.UserService;
import com.queryexample.entity.User;
import com.queryexample.exception.ResourceNotFoundException;
import com.queryexample.payload.UserDto;

@Service
public class ServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper; 
	
	private User userDtoToUser(UserDto dto) {
		User user=modelMapper.map(dto, User.class);
		return user;
	}
	
	private UserDto userToUserDto(User user) {
		UserDto userDto=modelMapper.map(user,UserDto.class);
		return userDto;
	}
	

	@Override
	public String addUser(UserDto dto) {
		userRepository.save(userDtoToUser(dto));
		return "Added";
	}

	@Override
	public List<UserDto> allUser() {
		List<User> user=userRepository.findAll();
		List<UserDto> userDto=userRepository.findAll().stream().map(this::userToUserDto).collect(Collectors.toList());
		return userDto;
	}
	
	
	@Override
	public UserDto getUserById(int id) {
	
		User user = this.userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User not found"));
		// User user = this.userRepository.findById(id).get();
		 return this.userToUserDto(user);
		
	}	
	
	
	@Override
	public String deleteUserById(int id) {
		Optional<User> user=userRepository.findById(id);
		userRepository.delete(user.get());
		return "User Deleted";
	}
	
	
	

	

	
	
	



}
