package com.queryexample.payload;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	
	
	
	private int id;
	
	@Size(min=2,max=30,message="Name length should between 2 to 30 charactors")
	private String firstName;
	@Size(min=2,max=30,message="Name length should between 2 to 30 charactors")
	private String lastName;
	private String city;
	//@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,20}$",message="Paasword should contain atleast one upper case,lower case ,specical character and one number and special character")
	private String password;
	//@Pattern(regexp = "^\\d{10}$",message="Invalid phone number")
	private String phoneNumber;
	@Range(min=18,message = "Only above 18 people can register")
	private int age;
	@Email
	private String email;
	private boolean status;
}
