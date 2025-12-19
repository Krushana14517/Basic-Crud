package com.example.model;

import jakarta.validation.constraints.Size;

public class Employee {
    
	private int id ;
	
	@Size(min = 5 ,message = "Length must minimum 4 letters.")
	private String fname;
	
	@Size(max = 5, message = "Maximum 5 letters is allowed.")
	private String lname;
	
	@Size( max = 10, message = "Mobile number must be of 10 digits.")
	private String mob;
	
	private int age;
	
	public void EmployeeModel(int id, String fname, String lname, String mob, int age) {
	
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFname() {return fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLname() {
		return lname;
	}
	
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getMob() {
		return mob;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

	
}

