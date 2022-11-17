package Main;

import java.util.Scanner;

public class Item04 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("\nA soma de todos os elementos do veto eh: " + start());
	}

	public static int start() {
		
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
				
		return somatorio(firstVetor);
	}
	
	public static int somatorio(int vetor[]) {
		
		int somatorio = 0;
		
		for(int i = 0; i < vetor.length; i ++) {
			somatorio += vetor[i];
		}
		return somatorio;
	}
}
