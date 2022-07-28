package org.globalLogic.springboot.service;

import java.util.List;

import org.globalLogic.springboot.model.Employee;

public interface EmployeeService {
	//To create a employee record
	Employee saveEmployee(Employee employee);
	
	//To read the employee record -- Read all of them or a one of them.
	List<Employee> getAllEmployees();
	
	//To read single employee record
	Employee getEmployeeById(long id);
	
	//To Update employee record
	Employee updateEmployee(Employee employee, long Id);
	
	//TO delete employee record
	void deleteEmployee(long id);

}