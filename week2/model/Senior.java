package model;

public class Senior extends Employee implements IEmployee {
	
	public Senior(){
		super();
	}
	
	public Senior(String newName){
		super(newName);
	}
	
	public String toString(){
		return "Senior Employee "+ getName() +" has salary " + getSalary();
	}

	@Override
	public void raiseSalary() {
		double salary = getSalary();
		salary = salary * 107;
		salary = salary / 100;	
		setSalary(salary);
	}
}
