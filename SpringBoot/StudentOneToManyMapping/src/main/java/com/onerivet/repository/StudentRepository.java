package com.onerivet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onerivet.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	

}
