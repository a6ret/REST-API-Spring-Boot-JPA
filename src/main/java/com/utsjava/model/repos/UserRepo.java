package com.utsjava.model.repos;

import org.springframework.data.repository.CrudRepository;

import com.utsjava.model.entities.User;

public interface UserRepo extends CrudRepository<User, Long>{

}
