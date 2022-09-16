package com.springboot.doctor;

public class Doctor {
	private int id;  
	private String name;  
	private String specialist;  
	private double salary;  
	public Doctor()  
	{  
	      
	} 
	public Doctor(int id, String name, String specialist, double salary)   
	{  
	super();  
	this.id = id;  
	this.name = name;  
	this.specialist = specialist;  
	this.salary = salary;  
	 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	} 
	
}
