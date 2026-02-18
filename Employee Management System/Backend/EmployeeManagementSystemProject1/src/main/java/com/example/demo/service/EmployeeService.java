package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeEntity saveEmployee(EmployeeEntity employee) {
		return employeeRepository.save(employee);
	}
	
	public List<EmployeeEntity> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
}
