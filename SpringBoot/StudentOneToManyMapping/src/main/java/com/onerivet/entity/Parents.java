package com.onerivet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Parents")
public class Parents {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int parentsId;
//	private int studentId;
	private String parentName;
	private int parentAge;
	private String parentOccupation;
	private String parentRelation;

}
