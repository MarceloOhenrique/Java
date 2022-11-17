package Main;

import java.util.Scanner;

public class Item01 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("O elemento selecionado esta na posicao: " + start());
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
		for(int i = 0; i < firstVetor.length; i ++) {
			System.out.print(firstVetor[i] + " ");
		}
		
		System.out.print("\nInforme o elemento do vetor desejado: ");
		int firstElementoVetor = sc.nextInt();
		
		return pesquisa(firstVetor, firstElementoVetor);
	}
	
	public static int pesquisa(int vetor[],int elementoVetor) {
	
		int contador = 0;
		int coletor = 0;
		
		for(int j = 0; j < vetor.length; j++) {
			if(vetor[j] == elementoVetor) {
				contador++;
				coletor = j;
			}
		}
		
		if(contador > 0) {
			return coletor + 1;
		}else {
			return -100;

		}
	}
}