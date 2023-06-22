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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
	public List<UserDto> allUser(int pageSize,int pageNumber,String sortBy) {
		
		Pageable pageable=PageRequest.of(0,3,Sort.by(sortBy));//(pageNumber, pageSize,Sort.by(sortBy));
		Page<User> user=userRepository.findAll(pageable);
		List<UserDto> userDto=userRepository.findAll(pageable).stream().map(this::userToUserDto).collect(Collectors.toList());
		return userDto;
	}
	
	
	@Override
	public UserDto getUserById(int id) {
	
		User user = this.userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User id  not found"));

		 return this.userToUserDto(user);
		
	}	
	
	
	@Override
	public String deleteUserById(int id) {
		User user=this.userDtoToUser(this.getUserById(id));
		userRepository.delete(user);
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

	@Override
	public List<String> allUserFirstName() {
		// TODO Auto-generated method stub
		return userRepository.allUserFirstName();
	}

	@Override
	public List<UserDto> allUserCity(String city) {
		// TODO Auto-generated method stub
		return userRepository.findByCity(city).stream().map(this::userToUserDto).collect(Collectors.toList());
	}

	@Override
	public List<String> allUserPhoneNumber() {
		// TODO Auto-generated method stub
		return userRepository.allUserPhoneNumber();
	}

	@Override
	public List<UserDto> allUserAboveAge() {
		// TODO Auto-generated method stub
		return userRepository.allUserAboveAge().stream().map(this :: userToUserDto).collect(Collectors.toList());
	}

	@Override
	public List<UserDto> userByStatusAndCity(String city,int status) {
		 //TODO Auto-generated method stub
		return userRepository.userByStatusAndCity(city,status).stream().map(this::userToUserDto).collect(Collectors.toList());
	}			

	

	@Override
	public List<String> userFirstLastNameByCity(String city) {
		// TODO Auto-generated method stub

		List<String> users=userRepository.userFirstLastNameByCity(city);

		return users;
	}

	@Override
	public List<Map<String, String>> userByFirstNameAndLastName(String city) {
		List<User> list = this.userRepository.findByCity(city);
		Iterator<User> itr = list.iterator();
		Map<String,String> map= new HashMap<String, String>();
		List l=new ArrayList<>();
		while(itr.hasNext()) {
			User u =itr.next();
			map.put("firstName", u.getFirstName());
			map.put("lastName", u.getLastName());
			l.add(map);
		}
		return l;
	}
	
	
	

	
	
	



}
