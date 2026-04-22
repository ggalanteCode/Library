package com.generation153.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation153.library.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	//aggiungere i metodi per trovare uno user by firstName
	//										   by lastName
	//										   e by FirstNameAndLastName

}
