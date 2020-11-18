package com.capgemini.springboot.service;

import java.util.List;

import com.capgemini.springboot.entity.EmployeeManagement;

 public interface EmployeeService {

	List<EmployeeManagement> getAllEmployee();
	EmployeeManagement getOneEmployee(int id);
	void createEmployee(EmployeeManagement employeeManagement);
	void deleteEmployee(int id);
	void updateEmployee(EmployeeManagement employeeManagement);
 }
