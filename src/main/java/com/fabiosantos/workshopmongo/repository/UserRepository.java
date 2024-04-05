package com.fabiosantos.workshopmongo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fabiosantos.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

	
}
