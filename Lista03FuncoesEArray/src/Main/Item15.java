package Main;

import java.util.Scanner;

public class Item15 {

	public static void main(String[] args) {

		complementacao();
	}

	public static void complementacao() {
		

		Scanner sc = new Scanner(System.in);
		
		int x = 30;
		int y = 150;		
		
		System.out.print("Informe o tamanho desejado para os vetores: ");
		int tamanhoVetor = sc.nextInt();
		
		int vetor1[] = new int[tamanhoVetor];
		int vetor2[] = new int[tamanhoVetor];
		int vetor3[] = new int[tamanhoVetor];

		for(int i = 0; i < tamanhoVetor; i ++) {
			vetor1[i] = (int)((Math.random() * y) - x);
		}for(int i = 0; i < tamanhoVetor; i ++) {
			vetor2[i] = (int)((Math.random() * y) - x);
		}
		
		for(int i = 0; i < tamanhoVetor; i++) {
				vetor3[i] = 10 - (vetor1[i] + vetor2[i]);
		}
		
		System.out.print("Valores do vetor A: " );
		for(int i = 0; i < tamanhoVetor; i ++) {
			System.out.print("[" + vetor1[i] + "]" + " ");
		}System.out.print("\nValores do vetor B: " );
		for(int i = 0; i < tamanhoVetor; i ++) {
			System.out.print("[" + vetor2[i] + "]" + " ");
		}System.out.print("\nVetor resultante:   " );
		for(int i = 0; i < tamanhoVetor; i++) {
			System.out.print("[" + vetor3[i] + "]" + " ");
		}
		
		sc.close();
	}
}
