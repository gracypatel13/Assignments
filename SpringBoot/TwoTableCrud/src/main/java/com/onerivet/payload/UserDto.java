package com.onerivet.payload;

import com.onerivet.entity.Address;
import com.onerivet.entity.Department;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {
	
private int userId;
	
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private String userPassword;
	private String userDept;
	private String userPosition;
	private int userExperience;
	private int userSalary;

	private AddressDto userAddress;
	private DepartmentDto department;
	//private int deptId;

}
