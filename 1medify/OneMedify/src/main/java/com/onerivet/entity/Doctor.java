package com.onerivet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Doctor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctorId;
	
	private String doctorEmail;
	
	private String doctorPassword;
	
	private String doctorConfirmPassword;
	
	private String doctorFirstName;
	
	private String doctorLastName;
	
	private String doctorSpecialization;
	
	private String doctorMobileNumber;
	
	private String doctorInstitute;
	
	private String doctorDateOfEstablishment;
	
	private String doctorGender;
	
	private String doctorAddress;
	
	private String doctorState;
	
	private String doctorCity;
	
	private boolean doctorStatus;
	
	
	

}
