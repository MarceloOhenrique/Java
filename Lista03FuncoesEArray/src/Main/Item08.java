package Main;

import java.util.Scanner;

public class Item08 {

	public static void main(String[] args) {

		priorizacao();
	}

	public static void priorizacao() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		int tamanhoVetor = sc.nextInt();
		
		int x = 30;
		int y = 150;		
		float media1 = 0;
		float media2 = 0;
		int tamanhoVetor2 = 0;
		int j = 0;

		int vetor[] = new int[tamanhoVetor];

		for(int i = 0; i < tamanhoVetor; i ++) {
			vetor[i] = (int)((Math.random() * y) - x);
		}
		
		System.out.print("Valores do vetor: " );
		for(int i = 0; i < tamanhoVetor; i ++) {
			System.out.print(vetor[i] + " ");
			media1 = media1 + vetor[i];
		}
		
		media1 = media1 / tamanhoVetor;
		
		System.out.println("\nA media do vetor 1 eh: " + media1);
		for(int i = 0; i < tamanhoVetor; i++) {
			if(media1 - vetor[i] < media1 / (tamanhoVetor - 1)) {
				tamanhoVetor2++;
			}
		}
		
		int vetor2[] = new int[tamanhoVetor2];
		
		for(int i = 0; i < tamanhoVetor; i++) {
			if(media1 - vetor[i] < media1 / (tamanhoVetor - 1)) {
				vetor2[j] = vetor[i];
				j++;
			}
		}
		System.out.println("_________________________________________________\n");
		System.out.print("Tamanho do vetor 2 eh: " + tamanhoVetor2 + "\nValores do vetor 2: " );
		for(int i = 0; i < tamanhoVetor2; i ++) {
			System.out.print(vetor2[i] + " ");
			media2 = media2 + vetor2[i];
		}
		
		media2 = media2 / tamanhoVetor2;
		
		System.out.println("\nA media do vetor 2 eh: " + media2);
	
		sc.close();
	}
}
