package Main;

import java.util.Scanner;

public class Item18 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Informe o tamanho do vetor: ");
		int tamanhoVetor = sc.nextInt();
		
		int vetor[] = new int[tamanhoVetor];
		
		for(int i = 0; i < tamanhoVetor; i ++) {
			vetor[i] = (int)(Math.random() * 10);
		}
		organizacao(vetor);
	}
	
	public static void organizacao(int vetor[]) {
	
		int aux = 0;
		
		System.out.print("Valores do vetor: " );
		for(int i = 0; i < vetor.length; i ++) {
			System.out.print(vetor[i] + " ");			
		}
		
		for(int i = 0; i < vetor.length; i++) {
			for(int j = i; j < vetor.length; j++) {
				if(vetor[i] > vetor[j]) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		System.out.print("\nValores do vetor organizado: " );
		for(int i = 0; i < vetor.length; i ++) {
			System.out.print(vetor[i] + " ");			
		}
	}
}
