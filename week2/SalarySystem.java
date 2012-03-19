import java.util.ArrayList;

import model.IEmployee;


public class SalarySystem {
	
	public static void RaiseSalary(IEmployee colleague){
		colleague.raiseSalary();
		Logging.Info("employee " + colleague.getName() + " has new salary: " + colleague.getSalary());
	}
	
	public static void PrintSalary(ArrayList<IEmployee> colleaguesToPrint){
		for(IEmployee colleagues : colleaguesToPrint){
			Logging.LogLine(colleagues.toString());
		}
	}
	
}
