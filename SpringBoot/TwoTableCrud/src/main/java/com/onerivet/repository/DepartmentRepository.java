package com.onerivet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onerivet.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
