package com.queryexample.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.queryexample.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public List<User> findByFirstName(String name);
	
//	@Query(value = "SELECT * FROM User_details_Crud_with WHERE last_Name =?",nativeQuery = true)
//	public List<User> findByLastName( String name);
//	
//	public List<User> findByStatus(boolean status);
//	
//	public List<User> findByCity(String city);
//	
//	@Query(value = "SELECT first_Name FROM User_details_Crud",nativeQuery = true)
//	public List<String> allUserFirstName();
//	
//	@Query(value = "SELECT city FROM User_details_Crud",nativeQuery = true)
//	public List<String> allUserCity();
//	
//	@Query(value = "SELECT phone_number FROM User_details_Crud",nativeQuery = true)
//	public List<String> allUserPhoneNumber();
//	
//	@Query(value="SELECT * FROM User_Details_Crud WHERE age >18 ",nativeQuery =true)
//	public List<User> allUserAboveAge();
//	
//	@Query(value = "  select * from user_details_crud where city=? AND status=?",nativeQuery =true)
//	public List<User> userByStatusAndCity(String city,int status);
//	
//	
//	@Query(value ="SELECT CONCAT(first_name, ' ',last_name) FROM user_details_crud WHERE city=?",nativeQuery = true)
//	public List<String> userFirstLastNameByCity(String city);
//	

	
	

}
