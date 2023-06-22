package com.onerivet.payload;

import java.util.List;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ParentsDto {
	private int parentsId;
//	private int studentId;
	private String parentName;
	private int parentAge;
	private String parentOccupation;
	private String parentRelation;

}
