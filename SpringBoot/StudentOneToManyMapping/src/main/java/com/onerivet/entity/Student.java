package com.onerivet.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Student")
@ToString
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String studentName;
	private String studentGender;
	private int studentClass;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="Student_Id",referencedColumnName = "studentId")
	private List<Address> studentAddress;
	
	@OneToMany(cascade = CascadeType.ALL)
	//@JoinColumn(name="Student_Id",referencedColumnName = "studentId")
	private List<Parents> studentParents;
	
	
	

}
