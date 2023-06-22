package com.onerivet.service;

import java.util.List;

import com.onerivet.payload.StudentDto;

public interface StudentService {

	public String addStudent(StudentDto dto);
	
	public StudentDto getStudentById(int id);
	
	public String deleteStudentById(int id);
	
	public List<StudentDto> getAllStudent();
}
