package com.springboot.web.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.web.entities.User;

public interface UserRepository extends CrudRepository<User,Integer>{
	

}