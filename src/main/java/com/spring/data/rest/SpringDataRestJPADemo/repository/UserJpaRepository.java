package com.spring.data.rest.SpringDataRestJPADemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.spring.data.rest.SpringDataRestJPADemo.model.Users;

@Component
public interface UserJpaRepository extends JpaRepository<Users, Long>{

	Users findByName(String name);
}
