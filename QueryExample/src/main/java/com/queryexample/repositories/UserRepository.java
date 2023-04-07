package com.queryexample.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.queryexample.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public List<User> findByFirstName(String name);
	
	@Query(value = "SELECT * FROM User WHERE lastName =?",nativeQuery = true)
	public List<User> findByLastName( String name);

}
