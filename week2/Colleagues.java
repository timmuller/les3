import java.util.ArrayList;

import model.IEmployee;


public class Colleagues {

	private ArrayList<IEmployee> employees;
	
	public Colleagues(){
		employees = new ArrayList<IEmployee>();
	}
	
	public void NewColleague(IEmployee newEmployee){
		employees.add(newEmployee);
	}
	
	public void RemoveColleague(IEmployee removeEmployee){
		employees.remove(removeEmployee);
	}
	
	public IEmployee getColleagueByName(String name){
		for(IEmployee employee : employees){
			if(employee.getName().equals(name)){
				return employee;
			}
		}
		return null;
	}
	
	public ArrayList<IEmployee> GetAllColleague(){
		return employees;
	}
	
}
