import java.util.ArrayList;

import model.IEmployee;

/**
 * @author Dennis van Waardenburg
 * @author Tim Muller
 * 
 * Object colleagues with contains
 * all colleauges in the company
 */

public class Colleagues {


	/**
	 * Arraylist with all employees
	 */
	private ArrayList<IEmployee> employees;
	

	/**
	 * Default constructor for Colleagues
	 * Init the arraylist with all Employees
	 */
	public Colleagues(){
		employees = new ArrayList<IEmployee>();
	}
	

	/**
	 * Add new Employee to company
	 *
	 * @param IEmployee new Employee in Company
	 */
	public void NewColleague(IEmployee newEmployee){
		employees.add(newEmployee);
	}
	

	/**
	 * Remove Employee of Company
	 *
	 * @param IEmployee remove Employee of company
	 */
	public void RemoveColleague(IEmployee removeEmployee){
		employees.remove(removeEmployee);
	}
	

	/**
	 * Get Colleague by knownen Name
	 *
	 * @param String name of Employee
	 * @return IEmployee
	 */
	public IEmployee getColleagueByName(String name){
		for(IEmployee employee : employees){
			if(employee.getName().equals(name)){
				return employee;
			}
		}
		return null;
	}
	

	/**
	 * Get all Colleagues of the company
	 *
	 * @return ArrayList<IEmployee>
	 */
	public ArrayList<IEmployee> GetAllColleague(){
		return employees;
	}
	
}
