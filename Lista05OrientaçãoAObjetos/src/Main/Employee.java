package Main;

public class Employee {

	public int id;
	public String firstName;
	public String latName;
	public float monthlySalary;
	public boolean workedDays[] = new boolean[30];
	public int aux = 0;

	
	
	public Employee(String firstName, String latName) {

		this.firstName = firstName;
		this.latName = latName;
	}

	public Employee(int id, String firstName, String latName) {

		this.id = id;
		this.firstName = firstName;
		this.latName = latName;
	}
	
	public float calculateEmployeeSalary() {
		
		float employeeSalary = monthlySalary;
		
		if(aux == 30) {
			employeeSalary += (employeeSalary * 0.01);
		}else if(aux >= 25 && aux <= 27 ) {
			employeeSalary -= (employeeSalary * (0.02 * (30 - aux))) ;
		}else if(aux >= 20 && aux <= 24 ) {
			employeeSalary -= (employeeSalary * (0.03 * (30 - aux))) ;
		}else if(aux <= 20 ) {
			employeeSalary -= (employeeSalary * 0.8);
		}
		
		return employeeSalary;
	}
	
	
	
}
