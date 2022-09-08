package com.example.userauthentication.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.userauthentication.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	User findByName(String name);
}
