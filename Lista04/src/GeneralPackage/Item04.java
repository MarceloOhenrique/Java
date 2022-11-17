package GeneralPackage;

import java.util.Scanner;

public class Item04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numberNames;
		
		System.out.print("Enter the Number of Names: ");
		numberNames = sc.nextInt();
		
		String names[] = new String[numberNames];

		System.out.println("Enter the Names: ");
		for (int i = 0; i < numberNames; i++) {
			names[i] = sc.next();
		}
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			System.out.print("Vowels:");
			for(int j = 0; j < names[i].length(); j++){
				if(names[i].charAt(j) == 'a' || names[i].charAt(j) == 'e' || names[i].charAt(j) == 'i'
						|| names[i].charAt(j) == 'o' || names[i].charAt(j) == 'u') {
				System.out.print(" " + names[i].charAt(j));
				} 
			}
			System.out.print("\nConsonants:");
			for(int j = 0; j < names[i].length(); j++){
				if(names[i].charAt(j) != 'a' && names[i].charAt(j) != 'e' && names[i].charAt(j) != 'i'
						&& names[i].charAt(j) != 'o' && names[i].charAt(j) != 'u') {
				System.out.print(" " + names[i].charAt(j));
				}
			}
			System.out.println("\n");
		}
		sc.close();
	}
}
