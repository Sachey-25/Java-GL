package org.globalLogic.springboot.controller;

import java.util.List;

import org.globalLogic.springboot.model.Employee;
import org.globalLogic.springboot.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	//build create employee REST API
	@PostMapping() //Adding -- Create method...
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>
		(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}
	
	//Build a method to get employees (Read) REST API
	@GetMapping()
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	//Build a method to get single employee record
	//http:localhost:8081/api/employees -----> overall data
	//http:localhost:8081/api/employees/{id} -----> gets me a single record
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById
								(@PathVariable ("id")Long employeeId){
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId),
				HttpStatus.OK); // status -- 200 
	}
	
	
	//Build a method to update the employee record REST API
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable ("id")Long id,
													@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee,id),
				HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable ("id") Long id){
		//delete employee db
		employeeService.deleteEmployee(id);
		return new ResponseEntity<String>("Employee record deleted successfully!",HttpStatus.OK);
	}
}
