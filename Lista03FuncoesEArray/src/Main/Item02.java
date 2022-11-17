package Main;

import java.util.Scanner;

public class Item02 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

	System.out.println("O valor do vetor nesse indice eh: " + start());
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
		
		System.out.print("\nInforme o indice desejado: ");
		int firstIndice = sc.nextInt();
		
		return pesquisaPorIndice(firstVetor, firstIndice);
	}
	
	public static int pesquisaPorIndice(int vetor[], int indice) {

		int cont = 0;
		int coletor = 0;
		
		for(int i = 0; i < vetor.length; i ++) {
			if(indice == i) {
				cont++;
				coletor = i;
			}
		}
		
		if(cont > 0) {
			return vetor[coletor - 1];
		}else {
			return 0;
		}
		
	}
}
