package com.testcrud.services.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testcrud.model.dto.UserDto;
import com.testcrud.model.entity.User;
import com.testcrud.repository.UserRepository;
import com.testcrud.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UserRepository userRepository;

	@Override
	public User add(User user) {
	
		return  userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(int id) {
		return userRepository.findById(id).get();
	}

	@Override
	public String delete(int id) {
		User u;
		u=userRepository.findById(id).get();
		if(u == null)
			return "User not found";
		else
			userRepository.delete(u);
		return "User Deleted...";
	}

	@Override
	public String update(int id , User user) {
		User u = new User();
		if(u == null)
			return "User not found";
		else
			u.setName(user.getName());
			u.setEmail(user.getEmail());
			userRepository.save(u);
		return "User updated...";
	}

	@Override
	public UserDto add(UserDto dto) {

		User user=modelMapper.map(dto, User.class);
		userRepository.save(user);
		
		UserDto userDto=modelMapper.map(userRepository.findById(user.getId()), UserDto.class);
		return userDto;  
	}
}
