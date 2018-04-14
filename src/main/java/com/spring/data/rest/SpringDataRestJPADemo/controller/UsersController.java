package com.spring.data.rest.SpringDataRestJPADemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.data.rest.SpringDataRestJPADemo.model.Users;
import com.spring.data.rest.SpringDataRestJPADemo.repository.UserJpaRepository;

@RestController
@RequestMapping("/Users")
public class UsersController {
	
	@Autowired
	private UserJpaRepository userJpaRepository;
	
	@GetMapping("/all")
	public List<Users> getAllUsers() {
		return userJpaRepository.findAll();
	}
	
	@GetMapping("/{name}")
	public Users getSingleUser(@PathVariable final String name) {
		return userJpaRepository.findByName(name);
	}
	
	@PostMapping("/load")
	public Users loadData(@RequestBody final Users users) {
		userJpaRepository.save(users);
		return userJpaRepository.findByName(users.getName());
	}
}
