package GeneralPackage;

public class Item01Object {
	
	public float basicWage;
	public int numberOfDependents;
	public float employeeWage;
	public float taxPaid;
	public double incomeTax;
	public double grossTax;

	public double calculateIncomeTax() {
		
		if(employeeWage > (basicWage * 12)) {
			grossTax = (employeeWage * 0.2);
		}else if(employeeWage <= (basicWage * 12) && employeeWage > (basicWage * 5)) {
			grossTax = (employeeWage * 0.08);
		}else if(employeeWage <= (basicWage * 5)) {
			grossTax = 0;
		}
	
		grossTax -= (numberOfDependents * 0.02) ;
		
		incomeTax = (grossTax + (grossTax * 0.04)) - taxPaid;

		return incomeTax;
	}
}
