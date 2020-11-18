package com.capgemini.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.springboot.entity.EmployeeManagement;
@Repository
public interface EmpRepository extends CrudRepository<EmployeeManagement, Integer>{

}
