import model.*;



public class Main {
	public static void main(String args[]) {
		Colleagues employees = new Colleagues();
		employees.NewColleague(new Junior("Jaap"));
		employees.NewColleague(new Medior("Fred"));
		employees.NewColleague(new Senior("Hans"));
		
		IEmployee colleagueJaap = employees.getColleagueByName("Jaap");
		colleagueJaap.setSalary(1700.0);
		IEmployee colleagueFred = employees.getColleagueByName("Fred");
		colleagueFred.setSalary(2000);
		IEmployee colleagueHans = employees.getColleagueByName("Hans");
		colleagueHans.setSalary(2300);
		
		SalarySystem.PrintSalary(employees.GetAllColleague());
		SalarySystem.RaiseSalary(colleagueJaap);
		SalarySystem.RaiseSalary(colleagueFred);
		SalarySystem.RaiseSalary(colleagueHans);
		SalarySystem.PrintSalary(employees.GetAllColleague());

	}
}
