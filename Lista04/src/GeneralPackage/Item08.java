package GeneralPackage;

import java.util.Scanner;

public class Item08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String numbers;
		int aux = 0;
		
		System.out.println("#NOTE THIS PROGRAM ONLY WORKS WITH UPPERCASE CHARACTERS#");

		System.out.print("Enter the Numbers: ");
		numbers = sc.next();
		
		System.out.print("Decoded Numbers: (");
		for (int i = 0; i < numbers.length(); i++) {
			if(i == 3) {
				System.out.print(")");
			}else if(numbers.charAt(i) == '#') {
				System.out.print("1");
			}else if(numbers.charAt(i) == 'A' || numbers.charAt(i) == 'B' || numbers.charAt(i) == 'C') {
				System.out.print("2");
			}else if(numbers.charAt(i) == 'D' || numbers.charAt(i) == 'E' || numbers.charAt(i) == 'F') {
				System.out.print("3");
			}else if(numbers.charAt(i) == 'G' || numbers.charAt(i) == 'H' || numbers.charAt(i) == 'I') {
				System.out.print("4");
			}else if(numbers.charAt(i) == 'J' || numbers.charAt(i) == 'K' || numbers.charAt(i) == 'L') {
				System.out.print("5");
			}else if(numbers.charAt(i) == 'M' || numbers.charAt(i) == 'N' || numbers.charAt(i) == 'O') {
				System.out.print("6");
			}else if(numbers.charAt(i) == 'P' || numbers.charAt(i) == 'Q' || numbers.charAt(i) == 'R' || numbers.charAt(i) == 'S') {
				System.out.print("7");
			}else if(numbers.charAt(i) == 'T' || numbers.charAt(i) == 'U' || numbers.charAt(i) == 'V') {
				System.out.print("8");
			}else if(numbers.charAt(i) == 'W' || numbers.charAt(i) == 'X' || numbers.charAt(i) == 'Y' || numbers.charAt(i) == 'Z') {
				System.out.print("9");
			}else if(numbers.charAt(i) == '+') {
				System.out.print("0");
			}else if(aux == 0) {
				System.out.print(numbers.charAt(i));
			}
		}
		sc.close();
	}
}
