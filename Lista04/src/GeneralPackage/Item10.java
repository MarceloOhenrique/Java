package GeneralPackage;

import java.util.Scanner;

public class Item10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double sum = 0;
		
		System.out.print("Enter the Number of Digits: ");
		int numberOfNumbers = sc.nextInt();
		
		int number[] = new int[numberOfNumbers];
		
		System.out.println("Enter " + numberOfNumbers + " Digits:");
		for(int i = 0; i < numberOfNumbers; i++) {
			number[i] = sc.nextInt();
		}
		
		for(int i = 0; i < numberOfNumbers; i++) {
			sum = sum + Math.pow(number[i], numberOfNumbers);
		}
		
		int finalNumber = numberOfNumbers - 1;
		int multiplier = 1;
		int storer = 0;
		for(int i = 0; i < numberOfNumbers; i++) {
			number[finalNumber] = number[finalNumber] * multiplier;
			storer = storer + number[finalNumber];
			multiplier = multiplier * 10;
			finalNumber--;
		}
	
		if(sum == storer) {
			System.out.println(storer + " It's an Armstrong number");
		}else {
			System.out.println(storer + " Not an Armstrong Number");
		}
		sc.close();
	}
}
