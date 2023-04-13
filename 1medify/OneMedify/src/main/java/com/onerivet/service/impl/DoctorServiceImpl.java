package com.onerivet.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onerivet.entity.Doctor;
import com.onerivet.payload.DoctorDto;
import com.onerivet.repository.DoctorRepository;
import com.onerivet.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	Doctor doctor;
	
	private Doctor doctorDtoToDoctor(DoctorDto dto) {
		
		Doctor doctor=modelMapper.map(dto,Doctor.class);
		return doctor;
	}
	
	private DoctorDto doctorToDoctorDto(Doctor doctor) {
		
		DoctorDto dto=modelMapper.map(doctor,DoctorDto.class);
		return dto;
	}
	
	@Override
	public String addDoctor(DoctorDto doctorDto) {
		// TODO Auto-generated method stub
		doctor=doctorDtoToDoctor(doctorDto);
	     doctorRepository.save(doctor);
	     return "Doctor Details saved successfully";
	}

	@Override
	public String doctorDetail(int doctorId) {
		// TODO Auto-generated method stub
		return doctorRepository.getDoctorDetail(doctorId);
	}

	@Override
	public DoctorDto docterById(int docotrId) {
		// TODO Auto-generated method stub
		return doctorToDoctorDto( doctorRepository.findById(docotrId).get());
	}
	

}
