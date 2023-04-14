package com.onerivet.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onerivet.entity.User;
import com.onerivet.payload.UserDto;
import com.onerivet.repository.UserRepository;
import com.onerivet.service.UserService;


@Service
public class UserServiceImpl implements UserService {

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
		// TODO Auto-generated method stub
		System.out.println(dto.getDepartment());
		User user=userDtoToUser(dto);
		System.out.println(user.getDepartment());
		//System.out.println(dto.getDeptId());
		 userRepository.save(user);
		return "Saved";
	}

}
