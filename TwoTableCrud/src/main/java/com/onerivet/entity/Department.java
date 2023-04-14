package com.onerivet.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Department")
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	 
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptId;
	//private int userId;
	private String userDepartment;
	private String userDeptHead;
	private String userDeptProject;
	
	@OneToMany(mappedBy ="department")
	private List<User> user;
	
	
	
	
	
	

}
