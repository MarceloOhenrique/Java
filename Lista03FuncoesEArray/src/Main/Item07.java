package Main;

import java.util.Scanner;

public class Item07 {

	public static void main(String[] args) {

		start();
	}

	public static void start() {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 30;
		int y = 150;		
		
		System.out.print("Informe o tamanho que sera usado nos dois vetores: ");
		int tamanhoVetor = sc.nextInt();
		
		int vetor1[] = new int[tamanhoVetor];
		int vetor2[] = new int[tamanhoVetor];
		
		for(int i = 0; i < tamanhoVetor; i ++) {
			vetor1[i] = (int)((Math.random() * y) - x);
		}for(int i = 0; i < tamanhoVetor; i ++) {
			vetor2[i] = (int)((Math.random() * y) - x);
		}
		
		System.out.print("Valores do vetor 1: " );
		for(int i = 0; i < tamanhoVetor; i ++) {
			System.out.print(vetor1[i] + " ");
		}System.out.print("\nValores do vetor 2: " );
		for(int i = 0; i < tamanhoVetor; i ++) {
			System.out.print(vetor2[i] + " ");
		}
		sc.close();
		
		inversaoDeVetores(vetor1, vetor2);
	}
	
	public static void inversaoDeVetores(int vetor1[], int vetor2[]) {

		int armazenador = 0;
		
		for(int i = 0; i < vetor1.length; i++) {
			armazenador = vetor1[i];
			vetor1[i] = vetor2[i];
			vetor2[i] = armazenador;
		}
		
		System.out.print("\n\nNovos valores do vetor 1: " );
		for(int i = 0; i < vetor1.length; i ++) {
			System.out.print(vetor1[i] + " ");
		}System.out.print("\nNovos valores do vetor 2: " );
		for(int i = 0; i < vetor1.length; i ++) {
			System.out.print(vetor2[i] + " ");
		}
	}
}
