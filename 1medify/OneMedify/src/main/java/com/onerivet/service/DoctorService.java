package com.onerivet.service;

import com.onerivet.payload.DoctorDto;

public interface DoctorService {
	
	public String addDoctor(DoctorDto doctor);
	
	public String doctorDetail(int doctorId);
	
	public DoctorDto docterById(int docotrId);

}
