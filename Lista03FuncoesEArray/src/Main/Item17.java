package Main;

import java.util.Scanner;

public class Item17 {

	public static void main(String[] args) {

		explosao();
	}

	public static void explosao() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		int tamanhoVetor = sc.nextInt();
		
		int vetor[] = new int[tamanhoVetor];
						
		System.out.println("Informe os elementos do vetor entrada:");
		for(int i = 0; i < tamanhoVetor; i++) {
			vetor[i] = sc.nextInt();
		}

		System.out.print("\nVetor saida: { ");
		for(int i = 0; i < tamanhoVetor; i++) {
			for(int j = 0; j < vetor[i]; j++) {
				System.out.print(vetor[i] + " ");
			}
		}System.out.print("}");
		sc.close();
	}
}
