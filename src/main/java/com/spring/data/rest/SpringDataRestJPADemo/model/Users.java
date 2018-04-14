package com.spring.data.rest.SpringDataRestJPADemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Users {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Long Salary;
	
	public Users(String name, Long salary) {
		super();
		this.name = name;
		Salary = salary;
	}
}
