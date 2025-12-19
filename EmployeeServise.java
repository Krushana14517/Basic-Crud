package com.example.servies;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.model.Employee;

@Service
public class EmployeeServise {
	
	
	private Map<Integer, Employee> mymap= new LinkedHashMap<>();
	
	private  AtomicInteger id= new AtomicInteger(100);
	
	//get all data
	public Collection<Employee>getEmploye(){
		return mymap.values();
	}
	
	// add new data
	public Employee Addemp(Employee employeeModel) {
		employeeModel.setId(id.incrementAndGet());
		 mymap.put(employeeModel.getId(), employeeModel);
		 return employeeModel;
	}
	
	//update existing data
	public String updateemp( int id   ,Employee ref   )
	{	
		if(mymap.containsKey(id))
		{
			ref.setId(id);
			mymap.put(ref.getId(), ref);
			return "value updatd";
		}
		else
		return "id not present" ;
		
	}
	
	
	//delete data
	public String deletwemp(int id)
	{
		if(mymap.containsKey(id))
		{
		mymap.remove(id);
		return "data delete ";
		}
		else
			return "id not presetn";
	}
	
	
	
}
