package com.capgemini.springboot.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.springboot.entity.EmployeeManagement;
import com.capgemini.springboot.repository.EmpRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmpRepository empRepository;

	@Override
	public List<EmployeeManagement> getAllEmployee() {
		List<EmployeeManagement> emp = new ArrayList<EmployeeManagement>();
		empRepository.findAll().forEach(employee 
				-> emp.add(employee));
		return emp;
	}

	@Override
	public EmployeeManagement getOneEmployee(int id) {
	
		return empRepository.findById(id).get();
	}

	@Override
	public void createEmployee(EmployeeManagement employeeManagement) {
		empRepository.save(employeeManagement);
	}

	@Override
	public void deleteEmployee(int id) {
		 empRepository.deleteById(id);
	}

	@Override
	public void updateEmployee(EmployeeManagement employeeManagement) {
		empRepository.save(employeeManagement);
	}

}
