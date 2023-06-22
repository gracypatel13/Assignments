package com.testcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testcrud.model.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
