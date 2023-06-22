package com.onerivet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onerivet.payload.StudentDto;
import com.onerivet.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public String addStudent(@RequestBody StudentDto dto) {
		return studentService.addStudent(dto);
	}
	
	@GetMapping("/getstudent/{id}")
	public StudentDto getStudentById(@PathVariable int id) {
		return studentService.getStudentById(id);
	}
	
	@DeleteMapping("/deletestudent/{id}")
	public String deleteStudentById(@PathVariable int id) {
		return studentService.deleteStudentById(id);
	}
	
	@GetMapping("/allstudent")
	public List<StudentDto> getAllStudent(){
		return studentService.getAllStudent();
	}
	
}
