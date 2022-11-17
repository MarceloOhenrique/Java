package GeneralPackage;

import java.util.Scanner;

public class Item01Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Item01Object firstTax = new Item01Object();
		
		System.out.print("Enter the Basic Wage: R$");
		firstTax.basicWage = sc.nextFloat();
		System.out.print("Enter the Number of Dependents: ");
		firstTax.numberOfDependents = sc.nextInt();
		System.out.print("Enter the Employee Wage: R$");
		firstTax.employeeWage = sc.nextFloat();
		System.out.print("Enter the Tax Paid: R$");
		firstTax.taxPaid = sc.nextFloat();
		
		System.out.println("Income Tax: R$" + firstTax.calculateIncomeTax());
		sc.close();
	}
}
