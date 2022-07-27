package org.globalLogic.springboot.service.impl;

import org.globalLogic.springboot.model.Employee;
import org.globalLogic.springboot.repository.EmployeeRepository;
import org.globalLogic.springboot.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	/*
	 * 1. Setter-Based dependency injection
	 * 2. COnstructor based dependency injection
	 */
	private EmployeeRepository employeeRespository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRespository) {
		super();
		this.employeeRespository=employeeRespository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRespository.save(employee);
	}

}
