package GeneralPackage;

import java.util.Scanner;

public class Item09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Height of the Triangle: ");
		int triangleHeight = sc.nextInt();
		int triangleBase = (triangleHeight - 1 ) * 2 + 1;
		
		int aux1=  (triangleBase/2);
		int aux2 = aux1 ;
		int aux3 = aux1;
		
		for(int i = 0; i < triangleHeight; i++) {
			for(int j = 0; j < triangleBase; j++) {
				if(j == aux1 || j == aux2 || j == aux3) {
					System.out.print(" * ");
				}else if(j > aux3 && j < aux2) {
					System.out.print(" * ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
			aux2++;
			aux3--;
		}
		sc.close();
	}
}
