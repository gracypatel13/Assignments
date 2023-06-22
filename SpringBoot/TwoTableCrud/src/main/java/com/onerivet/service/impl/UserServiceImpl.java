package com.onerivet.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onerivet.entity.Address;
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
		user.getDepartment().setUser(user);
		 userRepository.save(user);
		return "Saved";
	}

	@Override
	public List<UserDto> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll().stream().map(this::userToUserDto).collect(Collectors.toList());
	}

	@Override
	public String deleteUserById(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
		return "User deleted";
	}

	@Override
	public UserDto getUserById(int id) {
		// TODO Auto-generated method stub
		return userToUserDto(userRepository.findById(id).get());
	}

	@Override
	public String updateUserById(int id, UserDto dto) {
		// TODO Auto-generated method stub
		User u=userRepository.findById(id).get();
		userToUserDto(u);
		u.setUserEmail(dto.getUserEmail());
		u.setUserExperience(dto.getUserExperience());
		u.setUserFirstName(dto.getUserFirstName());
		u.setUserLastName(dto.getUserLastName());
		u.setUserPassword(dto.getUserPassword());
		u.setUserPosition(dto.getUserPosition());
		u.setUserSalary(dto.getUserSalary());
//		User user=userDtoToUser(dto);
//		u.setDepartment(user.getDepartment());
//		Address a=user.getUserAddress();
//		System.out.println(a.getCity());
//		System.out.println(u.getUserAddress());
//		u.setUserAddress(a);
//		u.setUserEmail(user.getUserEmail());
		
		return "updated";
	}

}
