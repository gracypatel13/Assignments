package com.onerivet.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onerivet.entity.Student;
import com.onerivet.payload.StudentDto;
import com.onerivet.repository.StudentRepository;
import com.onerivet.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	private Student studentDtoToStudent(StudentDto dto) {
		Student student=modelMapper.map(dto, Student.class);
		return student;
	}
	
	private StudentDto studentToStudentDto(Student student) {
		StudentDto dto=modelMapper.map(student, StudentDto.class);
		return dto;
	}
	
	@Override
	public String addStudent(StudentDto dto) {

		studentRepository.save(studentDtoToStudent(dto));
		return "Student Saved";
	}

	@Override
	public StudentDto getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentToStudentDto(studentRepository.findById(id).get());
	}

	@Override
	public String deleteStudentById(int id) {
		// TODO Auto-generated method stub
		studentRepository.delete(studentRepository.findById(id).get());
		return "Deleted";
	}

	@Override
	public List<StudentDto> getAllStudent() {
		// TODO Auto-generated method stub
		
		return studentRepository.findAll().stream().map(this:: studentToStudentDto).collect(Collectors.toList());
	}

}
