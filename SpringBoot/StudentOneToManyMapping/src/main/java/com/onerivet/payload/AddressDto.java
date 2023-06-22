package com.onerivet.payload;

import java.util.List;

import com.onerivet.entity.Address;
import com.onerivet.entity.Parents;

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
public class AddressDto {
	private int addressId;
	//private int studentId;
	private String street;
	private String city;
	private String state;
	private String type;
}
