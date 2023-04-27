package com.onerivet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onerivet.payload.UserDto;
import com.onerivet.repository.UserRepository;
import com.onerivet.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public String addUser(UserDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
