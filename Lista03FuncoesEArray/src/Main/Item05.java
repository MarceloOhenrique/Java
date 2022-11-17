package Main;

import java.util.Scanner;

public class Item05 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int vetorMain[] = start();
		
		System.out.print("\nValores do vetor final: ");
		for(int i = 0; i < vetorMain.length; i++) {
			System.out.print(vetorMain[i] + " ");
		}
	}
	
	public static int[] start() {
		
		int x = 30;
		int y = 150;		
		
		System.out.print("Informe o tamanho do vetor 1: ");
		int tamanhoVetor1 = sc.nextInt();
		System.out.print("Informe o tamanho do vetor 2: ");
		int tamanhoVetor2 = sc.nextInt();
		
		int firstVetor1[] = new int[tamanhoVetor1];
		int firstVetor2[] = new int[tamanhoVetor2];
		
		for(int i = 0; i < tamanhoVetor1; i ++) {
			firstVetor1[i] = (int)((Math.random() * y) - x);
		}for(int i = 0; i < tamanhoVetor2; i ++) {
			firstVetor2[i] = (int)((Math.random() * y) - x);
		}
		
		System.out.print("Valores do vetor 1: " );
		for(int i = 0; i < tamanhoVetor1; i ++) {
			System.out.print(firstVetor1[i] + " ");
		}System.out.print("\nValores do vetor 2: " );
		for(int i = 0; i < tamanhoVetor2; i ++) {
			System.out.print(firstVetor2[i] + " ");
		}
		return juncaoDeVetor(firstVetor1, firstVetor2);
	}

	public static int[] juncaoDeVetor(int vetor1[], int vetor2[]) {
		
		int armazenador = 0;

		int tamanhoVetorFinal = vetor1.length + vetor2.length;
		
		int vetorFinal[] = new int[tamanhoVetorFinal];

		for(int i = 0; i < tamanhoVetorFinal; i++) {
			if(i < vetor1.length) {
				vetorFinal[i] = vetor1[i];
			}else {
				vetorFinal[i] = vetor2[armazenador];
				armazenador++;
			}
		}
		return vetorFinal;
	}
}
