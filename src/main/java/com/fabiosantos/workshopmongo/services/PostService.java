package com.fabiosantos.workshopmongo.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabiosantos.workshopmongo.domain.Post;
import com.fabiosantos.workshopmongo.exception.ObjectNotFoundException;
import com.fabiosantos.workshopmongo.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new 
				ObjectNotFoundException("Objeto não encontrado"));
	}
	
	
}















