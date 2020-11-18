package com.capgemini.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class EmployeeManagement {
	@Id
	@GeneratedValue
	@Column
	private int empId;
	@Column
	private String name;
	@Column
	private String dept;
	@Column
	private int age;
	
	
	public EmployeeManagement() {
		
	}
	
	public EmployeeManagement(int empId, String name, String dept, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
