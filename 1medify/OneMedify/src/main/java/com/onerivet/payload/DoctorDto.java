package com.onerivet.payload;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class DoctorDto {
    private int doctorId;
    
    @Email
	private String doctorEmail;
	
    
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,20}$",message="Paasword should contain atleast one upper case,lower case ,specical character and one number and special character")
	private String doctorPassword;
   
    @NotBlank
	private String doctorConfirmPassword;
	
	@Size(min=2,max=30,message="Name length should between 2 to 30 charactors")
	private String doctorFirstName;
	
	@Size(min=2,max=30,message="Name length should between 2 to 30 charactors")
	private String doctorLastName;
	
	@NotBlank
	@Size(min=2,max=15)
	private String doctorSpecialization;
	
	@Pattern(regexp = "^\\d{10}$",message="Invalid phone number")
	private String doctorMobileNumber;
	
	@Size(max=50)
	private String doctorInstitute;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate doctorDateOfEstablishment;
	
	@Pattern(regexp = "(?:m|M|male|Male|f|F|female|Female|FEMALE|MALE|Not prefer to say)$",message="Invalid gender input")
	private String doctorGender;
	
	@Size(min=10,max=50)
	private String doctorAddress;
	
	@Size(min=5,max=15)
	private String doctorState;
	
	@Size(min=5,max=20)
	private String doctorCity;
	
	private boolean doctorStatus;
	
}
