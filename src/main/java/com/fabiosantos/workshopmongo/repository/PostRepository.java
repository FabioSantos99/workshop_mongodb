package com.fabiosantos.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fabiosantos.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {



	
}
