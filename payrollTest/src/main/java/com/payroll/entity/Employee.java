package com.payroll.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
public class Employee {

	public Employee(String name, String role){
		this.name = name;
		this.role = role;
	}
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String role;
	
}
