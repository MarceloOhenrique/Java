package Main;

import java.util.Scanner;

public class Item20 {

	public static void main(String[] args) {

		diferença_A();
	}

	public static void diferença_A(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o tamanho para ser usado nos 2 vetores: ");
		int tamanhoVetor = sc.nextInt();
		

		int vetorA[] = new int[tamanhoVetor];
		int vetorB[] = new int[tamanhoVetor];

		System.out.println("Informe os valores do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Informe os valores do vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
		}
		
		System.out.println();
		for(int i = 0; i < 1; i++) {
			for(int j = 0; j < tamanhoVetor; j++) {
				if(vetorA[i] != vetorB[j]) {
					System.out.print(vetorA[i] + " ");
					i++;
				}
			}
		}
		sc.close();
	}
}
