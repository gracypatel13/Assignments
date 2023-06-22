package com.testcrud.model.dto;

import lombok.Builder;

@Builder
public class UserDto {
	
	private int id;
	private String name;
	private String email;

}
