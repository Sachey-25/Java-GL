package org.globalLogic.springboot.service.impl;

import java.util.List;
import org.globalLogic.springboot.exception.ResourceNotFoundException;
import org.globalLogic.springboot.model.Employee;
import org.globalLogic.springboot.repository.EmployeeRepository;
import org.globalLogic.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	/*
	 * 1. Setter-Based dependency injection
	 * 2. COnstructor based dependency injection
	 */
	@Autowired
	private EmployeeRepository employeeRespository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRespository) {
		super();
		this.employeeRespository=employeeRespository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRespository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRespository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
//		Optional <Employee> employee = employeeRespository.findById(id);
//		if(employee.isPresent()) {
//			return employee.get();
//		}else {
//			throw new ResourceNotFoundException("Employee","Id",id);
//		}
		return employeeRespository.findById(id).orElseThrow( ()->
					new ResourceNotFoundException("Employee","Id",id));
			
	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {
		// We need to check whether the employee record with the given
		// Id is exists in DB or not.
		Employee existingEmployee=employeeRespository.findById(id).orElseThrow( ()->
		new ResourceNotFoundException("Employee","Id",id));
		
		// If the Id exists let's update the same with new value;
		existingEmployee.setFirstname(employee.getFirstname());
		existingEmployee.setLastname(employee.getLastname());
		existingEmployee.setEmail(employee.getEmail());
		
		//save existing employee to DB
		employeeRespository.save(existingEmployee);
		return existingEmployee;
	}

	@Override
	public void deleteEmployee(long id) {
		employeeRespository.findById(id).orElseThrow( ()->
						new ResourceNotFoundException("Employee","Id",id));
		employeeRespository.deleteById(id);	
	}
}