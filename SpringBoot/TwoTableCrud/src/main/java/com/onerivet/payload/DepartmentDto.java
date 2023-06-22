package com.onerivet.payload;

import com.onerivet.entity.User;

import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {
	private int deptId;
	//private int userId;
	private String userDepartment;
	private String userDeptHead;
	private String userDeptProject;
	
	

}
