package GeneralPackage;

import java.util.Scanner;

public class Item05 {
	
	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		
		int vectorSize1;
		int vectorSize2;
		int vectorSize3;
		
		System.out.print("Enter the size of Vector 1: ");
		vectorSize1 = sc.nextInt();
		float vector1[] = new float[vectorSize1];
		System.out.println("Enter the values:");
		fillVectors(vector1);
		System.out.print("Vector 1 Values: " );
		for(int i = 0; i < vectorSize1; i ++) {
			System.out.print(vector1[i] + " ");
		}
		System.out.println("\nVector sum 1: " + vectorSum(vector1));
		System.out.println("Vector multiplication 1: " + vectorMultiplication(vector1));
		System.out.println("Vector average 1: " + vectorAverage(vector1));

		
		
		System.out.print("\n\nEnter the size of Vector 2: ");
		vectorSize2 = sc.nextInt();
		float vector2[] = new float[vectorSize2];
		System.out.println("Enter the values:");
		fillVectors(vector2);
		System.out.print("Vector 2 Values: " );
		for(int i = 0; i < vectorSize2; i ++) {
			System.out.print(vector2[i] + " ");
		}
		System.out.println("\nVector sum 2: " + vectorSum(vector2));
		System.out.println("Vector multiplication 2: " + vectorMultiplication(vector2));
		System.out.println("Vector average 2: " + vectorAverage(vector2));

		

		System.out.print("\n\nEnter the size of Vector 3: ");
		vectorSize3 = sc.nextInt();
		float vector3[] = new float[vectorSize3];
		System.out.println("Enter the values:");
		fillVectors(vector3);
		System.out.print("Vector 3 Values: " );
		for(int i = 0; i < vectorSize3; i ++) {
			System.out.print(vector3[i] + " ");
		}
		System.out.println("\nVector sum 3: " + vectorSum(vector3));
		System.out.println("Vector multiplication 3: " + vectorMultiplication(vector3));
		System.out.println("Vector average 3: " + vectorAverage(vector3));

		
		float vectorAllSums[] = {vectorSum(vector1), vectorSum(vector2), vectorSum(vector3)};
		System.out.print("\nVector all sums:");
		for (int i = 0; i < vectorAllSums.length; i++) {
			System.out.print(" " + vectorAllSums[i]);
		}
		
		float vectorAllMultiplication[] = {vectorMultiplication(vector1), vectorMultiplication(vector2), vectorMultiplication(vector3)};
		System.out.print("\nVector all Multiplications:");
		for (int i = 0; i < vectorAllMultiplication.length; i++) {
			System.out.print(" " + vectorAllMultiplication[i]);
		}
		
		float vectorAllAverage[] = {vectorAverage(vector1), vectorAverage(vector2), vectorAverage(vector3)};
		System.out.print("\nVector all averages:");
		for (int i = 0; i < vectorAllAverage.length; i++) {
			System.out.print(" " + vectorAllAverage[i]);
		}
		
		System.out.println("\n\nAll sums: " + vectorSum(vectorAllSums));
		System.out.println("All averages: " + vectorAverage(vectorAllAverage));
		System.out.println("All multiplications: " + vectorMultiplication(vectorAllMultiplication));
		
	}
	
	public static float[] fillVectors(float vetor[]) {
		for(int i = 0; i < vetor.length; i ++) {
			vetor[i] = sc.nextFloat();
		}
		return vetor;	
	}
	
	public static float vectorSum(float vector[]) {
		int sum = 0;
		for (int i = 0; i < vector.length; i++) {
			sum += vector[i];
		}
		return sum;
	}
	
	public static float vectorMultiplication(float vector[]) {
		float multiplication = 1;
		for (int i = 0; i < vector.length; i++) {
			multiplication = multiplication * vector[i];
		}
		return multiplication;
	}
	
	public static float vectorAverage(float vetor[]) {
		float average = (vectorSum(vetor) / vetor.length);
		return average;
	}
}
