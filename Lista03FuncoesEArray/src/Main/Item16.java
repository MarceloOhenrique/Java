package Main;

import java.util.Scanner;

public class Item16 {

	public static void main(String[] args) {

		polarizacao();
	}

	public static void polarizacao() {
		
		Scanner sc = new Scanner(System.in);

		int x = 30;
		int y = 150;		
		int aux = 0;
		int coletor;

		System.out.print("Informe o tamanho do vetor: ");
		int tamanhoVetor = sc.nextInt();
		
		int vetor[] = new int[tamanhoVetor];
		
		for(int i = 0; i < tamanhoVetor; i ++) {
			vetor[i] = (int)((Math.random() * y) - x);
		}
		
		System.out.print("Valores do vetor: " );
		for(int i = 0; i < tamanhoVetor; i ++) {
			System.out.print(vetor[i] + " ");			
		}
		
		for(int i = 0; i < tamanhoVetor; i++) {
			if(vetor[i] % 2 != 0) {
				coletor = vetor[aux];
				vetor[aux] = vetor[i];
				vetor[i] = coletor;
				aux++;
			}
		}
		
		System.out.println();
		System.out.print("Novos valores do vetor: " );
		for(int i = 0; i < tamanhoVetor; i ++) {
			System.out.print(vetor[i] + " ");			
		}
		sc.close();		
	}
}
