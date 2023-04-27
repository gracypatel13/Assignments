package com.onerivet.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {
	
	private String firstName;
	private String lastName;
	private String city;
	private String password;
	private String phoneNumber;
	private int age;
	private String email;
	private boolean status;
}
