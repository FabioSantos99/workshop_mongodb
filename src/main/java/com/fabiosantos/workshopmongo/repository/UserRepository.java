package com.fabiosantos.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fabiosantos.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {


	
}
