package com.onerivet.payload;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
public class StudentDto {
	private int studentId;
	private String studentName;
	private String studentGender;
	private int studentClass;
	
	private List<AddressDto> studentAddress;
	private List<ParentsDto> studentParents;
}
