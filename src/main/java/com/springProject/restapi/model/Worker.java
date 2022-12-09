package com.springProject.restapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Worker
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	String name;
	
	String department;
	
	Integer salary;

	public Worker()
	{
		super();
	}

	public Worker(Integer id, String name, String department, Integer salary)
	{
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
	

}
