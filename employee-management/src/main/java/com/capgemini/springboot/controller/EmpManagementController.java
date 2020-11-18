package com.capgemini.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springboot.entity.EmployeeManagement;
import com.capgemini.springboot.service.EmployeeServiceImpl;

@RestController
public class EmpManagementController {
	
	@Autowired
	EmployeeServiceImpl employeeService;

    @GetMapping("/employee")
    private List<EmployeeManagement> getAllEmployees() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employee/{id}")
    private EmployeeManagement getEmployee(@PathVariable("id") int id) {
        return employeeService.getOneEmployee(id);
    }

    @DeleteMapping("/employee/{id}")
    private void deleteEmployee(@PathVariable("id") int id) {
    	employeeService.deleteEmployee(id);
    }

    @PostMapping("/employee")
    private void createEmployee(@RequestBody EmployeeManagement employee) {
    	employeeService.createEmployee(employee);
    }
    @PutMapping("/employee/{id}")
    private void updateEmployee(@RequestBody EmployeeManagement employee) {
    	employeeService.updateEmployee(employee);
    }

}
