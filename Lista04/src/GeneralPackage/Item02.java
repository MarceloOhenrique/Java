package GeneralPackage;

import java.util.Scanner;

public class Item02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		float toolRental;
		String toolName;
		String dayOfTheWeek;
		String toolQuality;
		
		System.out.print("Enter the tool name: ");
		toolName = sc.nextLine();
		System.out.print("Enter the tool rental amount: R$");
		toolRental = sc.nextFloat();
		System.out.print("Enter the day of the week: ");
		dayOfTheWeek = sc.next();
		System.out.print("Enter whether the tool is old or new: ");
		toolQuality = sc.next();

		rentalRule(dayOfTheWeek, toolQuality, toolRental);
		
		System.out.println("The tool" + toolName + " costs R$" + rentalRule(dayOfTheWeek, toolQuality, toolRental) +
				" on the they of " + dayOfTheWeek);
		sc.close();
	}
	
	public static float rentalRule(String dayOfTheWeek, String toolQuality, float toolRental) {
		
		if(dayOfTheWeek.equals("monday") || dayOfTheWeek.equals("tuesday") || dayOfTheWeek.equals("thursday")) {
			toolRental -= (toolRental * 0.4);
		}
	
		if(toolQuality.equals("new")) {
			toolRental += (toolRental * 0.15);
		}
		return toolRental;
	}
}
