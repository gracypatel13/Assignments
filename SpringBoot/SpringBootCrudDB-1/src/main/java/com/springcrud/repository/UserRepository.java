package com.springcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcrud.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public List<User> findUserByName(String name);

	//public User updateUserName(int id,String name);
}
