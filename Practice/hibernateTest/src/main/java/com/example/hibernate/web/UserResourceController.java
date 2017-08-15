package com.example.hibernate.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernate.model.Users;
import com.example.hibernate.repo.UsersRepository;

@RestController
@RequestMapping("/rest/users")
public class UserResourceController {

	@Autowired
	UsersRepository userRepository;
	
	@GetMapping("/all")
	public List<Users> getAll() {
		
		return userRepository.findAll();
	}
	
	@GetMapping("/{name}")
	public List<Users> getUser(@PathVariable("name") String name) {
		
		Optional<List<Users>> listOptional = userRepository.findByName(name);
		List<Users> users = listOptional
							.orElse(new ArrayList<>());
//							.orElseThrow(() -> new RuntimeException("No users Found"));
		
		return users;
	}
	
	@GetMapping("/id/{id}")
	public Users getId(@PathVariable("id") int id) {
		return userRepository.findOne(id);
	}
	
	@GetMapping("/update/{id}/{name}")
	public Users update(@PathVariable("id") int id, @PathVariable("name") String name) {
	
		Users users = getId(id);
		users.setName(name);
		
		return userRepository.save(users);
		
	}
	
}
