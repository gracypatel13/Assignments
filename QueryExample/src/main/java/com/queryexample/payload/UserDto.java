package com.queryexample.payload;

import lombok.Data;

@Data
public class UserDto {
	
	private int id;
	private String firstName;
	private String lastName;
	private String city;
	private String password;
	private double phoneNumber;
}
