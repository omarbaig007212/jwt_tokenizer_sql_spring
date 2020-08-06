package com.tokenizerjwt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tokenizerjwt.model.DAOUser;

@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {
	
	DAOUser findByUsername(String username);
	
}