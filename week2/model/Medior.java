package model;

public class Medior extends Employee implements IEmployee{
	
	public Medior(){
		super();
	}
	
	public Medior(String newName){
		super(newName);
	}
	
	public String toString(){
		return "Medior employee "+ getName() +" has salary " + getSalary();
	}
	

	@Override
	public void raiseSalary() {
		double salary = getSalary();
		salary = salary * 106;
		salary = salary + 20000;
		salary = salary / 100;
		setSalary(salary);
	}
	
}
