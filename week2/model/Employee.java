package model;

public class Employee {

	private String name;
	private double salary;
	
	public Employee(){
		name = "";
		salary = 0.0;
	}
	
	public Employee(String newName){
		name = newName;
		salary = 0.0;
	}
	
	public String getName(){
		return name;
	}
	
	public void setSalary(double newSalary){
		salary = newSalary;
	}
	
	public double getSalary(){
		return salary;
	}
	
}
