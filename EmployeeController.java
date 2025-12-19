package com.example.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.servies.EmployeeServise;

import jakarta.validation.Valid;
@RestController
public class EmployeeController {

	
	@Autowired
	EmployeeServise empSer;
	
	@GetMapping("/emp")
	public Collection<Employee>getempdata()
	{
		return empSer.getEmploye();
	}
	
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody @Valid Employee employeeModel )
	{
		return empSer.Addemp(employeeModel);
	}
	
	@PutMapping("/updateemp/{id}")
	public String update(@PathVariable int id , @RequestBody  Employee ref  )
	{
		return empSer.updateemp(id, ref);
		
	}
	
	@DeleteMapping("delete/{id}")
	public String delete(@PathVariable int id)
	{
		return empSer.deletwemp(id);
	}
	
}
