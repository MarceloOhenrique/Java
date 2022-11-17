package Main;

import java.util.Scanner;

public class Item19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o numero de agrupamento desejado: ");
		int numeroDeAgrupamento = sc.nextInt();
		System.out.print("Informe o tamanho do vetor desejado: ");
		int tamanhoDoVetor = sc.nextInt();
		
		agrupamento(numeroDeAgrupamento, tamanhoDoVetor);
		
		sc.close();
	}

	public static void agrupamento(int numeroDeAgrupamento, int tamanhoDoVetor) {
		
		int x = 30;
		int y = 150;	
		int coletor = numeroDeAgrupamento;
		int tamanhoVetor = 10;
		int firstVetor[] = new int[tamanhoVetor];
		
		for(int i = 0; i < tamanhoVetor; i ++) {
			firstVetor[i] = (int)((Math.random() * y) - x);
		}
		
		System.out.println("Valores do vetor: " );
		for(int i = 0; i < tamanhoVetor; i ++) {
			if(i == numeroDeAgrupamento) {
				System.out.println();
				numeroDeAgrupamento = coletor + numeroDeAgrupamento; 
			}System.out.print(firstVetor[i] + " ");		
		}
	}
}
