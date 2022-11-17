package Main;

import java.util.Random;
import java.util.Scanner;

public class Item11 {

	public static void main(String[] args) {

		descompactacao();
	}

	public static void descompactacao() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		int tamanhoVetor = sc.nextInt();
		tamanhoVetor++;
				
		int vetor[] = new int[tamanhoVetor];
		
		Random aleatorio = new Random();

		for(int i = 0; i < tamanhoVetor; i++) {
			vetor[i] = aleatorio.nextInt((1)+1);
		}
		
		int pulo = vetor[0];
		int armazenador = 0;
		int anterior = 0;
				
		System.out.print("Vetor de entrada: ");
		for(int i = 0; i <tamanhoVetor; i ++) {
			if(vetor[i] == pulo) {
				armazenador++;				
			}if(armazenador < 1){
				armazenador = 1;
			}if(i >= 1) {
				anterior = i;
				if(vetor[i] != pulo) {
					anterior--;
					System.out.print(armazenador  + "" + vetor[anterior] + " ");
					armazenador = 1;
				}
			}if(i == tamanhoVetor - 1) {
				System.out.print(armazenador  + "" + vetor[i] + " ");
			}
			pulo = vetor[i];
		}
		
		System.out.print("\nValor de saida: " );
		for(int i = 0; i < tamanhoVetor; i ++) {
			if(vetor[i] == pulo) {
				System.out.print(vetor[i]);
			}else {
				System.out.print(" " + vetor[i]);
			}
			pulo = vetor[i];
		}

		sc.close();
	}
}
