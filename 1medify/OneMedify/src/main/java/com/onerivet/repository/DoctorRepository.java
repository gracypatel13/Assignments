package com.onerivet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onerivet.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
	
	@Query(value ="SELECT CONCAT(doctor_id,' ',doctor_first_name ,' ',doctor_last_name) FROM Doctor WHERE doctor_id=?",nativeQuery=true)
	public String getDoctorDetail(int docterId);
	
	
	//public Doctor findByDoctorId(int doctorId);

}
