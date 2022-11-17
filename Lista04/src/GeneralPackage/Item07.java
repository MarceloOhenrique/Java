package GeneralPackage;

import java.util.Scanner;

public class Item07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String name;

		System.out.print("Enter Name: ");
		name = sc.nextLine();
		
		int aux = name.length() - 1;
		
		System.out.print("Inverted Name: ");
		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(aux));
			aux--;
		}
		sc.close();
	}
}
