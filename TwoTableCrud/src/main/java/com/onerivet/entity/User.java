package com.onerivet.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Emp_User")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private String userPassword;
	private String userDept;
	private String userPosition;
	private int userExperience;
	private int userSalary;

	private Address userAddress;
	@ManyToOne
	@JoinColumn(name="deptId",referencedColumnName = "deptId")
	private Department department;
	
	//private int deptId;

}
