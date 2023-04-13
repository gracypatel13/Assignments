package com.onerivet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onerivet.payload.DoctorDto;
import com.onerivet.service.DoctorService;

import jakarta.validation.Valid;

@RequestMapping("/doctor")
@RestController
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/signup")
	public String addDoctor(@Valid@RequestBody DoctorDto dto) {
		return doctorService.addDoctor(dto);
	}
	
	@GetMapping("/doctorhomepage/{id}")
	public String doctorDetail(@PathVariable int id) {
		return doctorService.doctorDetail(id);
	}
	
	@GetMapping("/byid/{id}")
	public DoctorDto doctorById(@PathVariable int id) {
		return doctorById(id);
	}
}
