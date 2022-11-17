package Main;

import java.util.Scanner;

public class Item12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		System.out.print("Digite o numero de linhas: ");
		int linhas = sc.nextInt();
		System.out.print("Digite o numero de colunas: ");
		int colunas = sc.nextInt();
		
		System.out.println("\n [ITEM A]");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				
				if(i == j || i > j) {
					System.out.print(" * ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n [ITEM B]");
		int ultimaColuna = colunas - 1;
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				
				if(i == j || j == ultimaColuna) {
					System.out.print(" # ");
				}else {
					System.out.print(" * ");
				}
			}
			System.out.println();
			ultimaColuna--;
		}

		System.out.println("\n [ITEM C]");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if(i % 2 == 0) {
					System.out.print(" # ");
				}else {
					System.out.print(" * ");
				}				
			}
			System.out.println();
		}

		System.out.println("\n [ITEM D]");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if(i == 0 || i == linhas - 1 || j == 0 || j == colunas - 1) {
					System.out.print(" # ");
				}else {
					System.out.print(" * ");
				}				
			}
			System.out.println();
		}

		System.out.println("\n [ITEM E]");
		int aux = linhas/2;
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if(i <= aux-1) {
					System.out.print(" * ");
				}if( i >= aux && j % 2 == 0) {
					System.out.print(" # ");
				}if(i >= aux && j % 2 != 0) {
					System.out.print(" $ ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
