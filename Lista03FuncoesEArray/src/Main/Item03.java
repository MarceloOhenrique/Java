package Main;

import java.util.Scanner;

public class Item03 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		start();
	}

	public static void start() {
		
		int x = 30;
		int y = 150;		

		System.out.print("Informe o tamanho do vetor: ");
		int tamanhoVetor = sc.nextInt();
		
		int firstVetor[] = new int[tamanhoVetor];
		
		for(int i = 0; i < tamanhoVetor; i ++) {
			firstVetor[i] = (int)((Math.random() * y) - x);
		}
		
		System.out.print("Valores do vetor: " );
		for(int i = 0; i < tamanhoVetor; i ++) {
			System.out.print(firstVetor[i] + " ");			
		}
		
		separacaoDeValores(firstVetor);
	}
	public static void separacaoDeValores(int vetor[]) {
		
		int aux = 0;
		int coletor;
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 0) {
				coletor = vetor[aux];
				vetor[aux] = vetor[i];
				vetor[i] = coletor;
				aux++;
			}
		}
		
		System.out.println();
		System.out.print("Novos valores do vetor: " );
		for(int i = 0; i < vetor.length; i ++) {
			System.out.print(vetor[i] + " ");			
		}
	}
}
