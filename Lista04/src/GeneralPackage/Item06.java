package GeneralPackage;

import java.util.Scanner;

public class Item06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double startingMass;
		double finalMass;
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		
		System.out.print("Enter the Starting Mass: ");
		startingMass = sc.nextDouble();
		
		finalMass = startingMass;
		
		while(finalMass > 0.5) {
			finalMass = finalMass/2;
			seconds += 50;
		} 
		if(seconds >= 60) {
			minutes = seconds / 60;
			seconds = seconds % 60;
		}if(minutes >= 60) {
			hours = minutes / 60;
			minutes = minutes % 60;
		}

		System.out.println("Starting Mass: " + startingMass + "g");
		System.out.println("Final Mass: " + finalMass + "g");
		System.out.println("Time: " + hours + "h:" + minutes + "min:" + seconds + "sec");

		sc.close();
	}
	

}
