package Main;

import java.util.Scanner;

public class Item10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		System.out.println("Digite a quantidade de vezes que deseja executar a sequencia de pares.");
		int quantidade = sc.nextInt();
		
		int[] esquerda = new int[quantidade];
		int[] direita = new int[quantidade];
		
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Digite o teto da esquerda.");
			esquerda[i] = sc.nextInt();
			System.out.println("Digite o teto da direita.");
			direita[i] = sc.nextInt();
		}
		for(int i = 0; i < quantidade; i++) {
			System.out.println(esquerda[i] + " - " + direita[i]);
		}
		sc.close();
	}

}
