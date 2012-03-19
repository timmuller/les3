package model;

public class Junior extends Employee implements IEmployee{
	
	public Junior(){
		super();
	}
	
	public Junior(String newName){
		super(newName);
	}
	
	public String toString(){
		return "Junior employee " + getName() + " has salary " + getSalary();
	}

	@Override
	public void raiseSalary() {
		double salary = getSalary();
		salary = salary * 105;
		salary = salary + 10000;
		salary = salary / 100;
		setSalary(salary);
		
	}
	
}
