package com.queryexample.service.impl;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.queryexample.repositories.UserRepository;

import com.queryexample.entity.User;

import com.queryexample.payload.UserDto;

@Service
public class ServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	private User userDtoToUser(UserDto dto) {
		User u=new User();
		u.setFirstName(dto.getFirstName());
		u.setLastName(dto.getLastName());
		u.setCity(dto.getCity());
		u.setId(dto.getId());
		u.setPassword(dto.getPassword());
		u.setPhoneNumber(dto.getPhoneNumber());
		return u;
		
		
	}
	private UserDto userToUserDto(User u) {
		UserDto dto=new UserDto();
		dto.setFirstName(u.getFirstName());
		dto.setLastName(u.getLastName());
		dto.setCity(u.getCity());
		dto.setId(u.getId());
		dto.setPassword(u.getPassword());
		dto.setPhoneNumber(u.getPhoneNumber());
		return dto;
		
		
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
		//Iterator itr=user.iterator();
		
		
		return userDto;
	}
	@Override
	public UserDto getUserById(int id) {
		try {
		 User user = this.userRepository.findById(id).get();
		 return this.userToUserDto(user);
		}catch(NullPointerException ex) {
			ex.printStackTrace();
			return null;
		}
	
	
	
		
		
	}
	@Override
	public String deleteUserById(int id) {
		Optional<User> u=userRepository.findById(id);
		userRepository.delete(u.get());
		return "User Deleted";
	}
	@Override
	public String deleteAllUser() {
		
		userRepository.deleteAll();
		
		return "All User Deleted";
	}
	@Override
	public List<UserDto> getUserByFirstName(String name) {
		// TODO Auto-generated method stub
		return userRepository.findByFirstName(name).stream().map(this::userToUserDto).collect(Collectors.toList());
	}
	@Override
	public List<UserDto> getUserByLastName(String name) {
		// TODO Auto-generated method stub
		return userRepository.findByLastName(name).stream().map(this::userToUserDto).collect(Collectors.toList());
	}
	
	
	



}
