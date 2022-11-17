package Main;

import java.util.Scanner;

public class Item06 {

	public static void main(String[] args) {

		inversaoDeOrdem();
	}
	
	public static void inversaoDeOrdem() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		int tamanhoVetor = sc.nextInt();
		
		int x = 30;
		int y = 150;		
		int auxiliar = tamanhoVetor - 1;

		int vetor[] = new int[tamanhoVetor];

		for(int i = 0; i < tamanhoVetor; i ++) {
			vetor[i] = (int)((Math.random() * y) - x);
		}
		
		System.out.print("Valores do vetor: " );
		for(int i = 0; i < tamanhoVetor; i ++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.print("\nValores do vetor invertidos: " );
		for(int i = 0; i < tamanhoVetor; i ++) {
			System.out.print(vetor[auxiliar] + " ");
			auxiliar--;
		}
		sc.close();
	}

}
