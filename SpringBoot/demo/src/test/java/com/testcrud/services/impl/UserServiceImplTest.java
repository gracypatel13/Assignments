package com.testcrud.services.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testcrud.model.dto.UserDto;
import com.testcrud.model.entity.User;
import com.testcrud.repository.UserRepository;

import lombok.Builder;


@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
	@Mock
	 UserRepository  userRepository;
	
	UserServiceImpl serviceImpl;
	
	User user;
	
	UserDto dto;
	
	@Mock
	ModelMapper modelMapper;
	
	
	@BeforeEach
    void setUp() throws Exception {
        this.serviceImpl= new UserServiceImpl(this.userRepository);
         user=User.builder()
    			.id(1)
    			.name("Gracy")
    			.email("gracypatel13@gmail.com")
    			.build();
         dto=UserDto.builder()
     			.id(1)
     			.name("Gracy")
     			.email("gracypatel13@gmail.com")
     			.build();
         
    }
	
	

	@Test
	void testAdd() {
		
		mock(User.class);
		mock(UserServiceImpl.class);
		when(this.userRepository.save(user)).thenReturn(user);
		User savedUser=serviceImpl.add(user);
		assertEquals(user,savedUser);
		//fail("Not yet implemented");
	}

	@Test
	void testGetAllUser() {
		fail("Not yet implemented");
	}

	@Test
	void testGetUser() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}
	
	@Test
	void testAddUserModelMapper() {
		mock(User.class);
		mock(UserServiceImpl.class);
		
		when(modelMapper.map(dto, User.class)).thenReturn(user);
        when(userRepository.save(user)).thenReturn(user);
        when(modelMapper.map(user, UserDto.class)).thenReturn(dto);
      //  when(userRepository.findById(user.getId()).get()).thenReturn(user);
        
        UserDto result =serviceImpl.add(dto);
        assertThat(result).isEqualTo(dto);
		
		
	}

}
