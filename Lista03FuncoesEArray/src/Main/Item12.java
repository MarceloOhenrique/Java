package Main;

import java.util.Scanner;

public class Item12 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numeroDeCaracteres;		
		
		System.out.print("Digite o numero de caracteres que deseja digitar: ");
		numeroDeCaracteres = sc.nextInt();
		
		char msg[] = new char[numeroDeCaracteres];
		
		criptografia(msg);
	}

	
	public static void criptografia(char msg[]) {
		char vetorChar[] = {'a',' ', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'x', 'z', 'k', 'w', 'y' };
		char vetorCriptografia[] = {'%',' ', '*', '(', '-', '+', '@', '#', '1', '2', '3', '4', '5', '6', '7', '8',
				'9', '{', '}', '!', '&', '$', '?', ':', '9', '.', '|' };
	
		System.out.println("Digite um caractere por vez:");
		for(int i = 0; i < msg.length; i++) {
			msg[i] = sc.next().charAt(0);
		}
	
		for (int j = 0; j < msg.length; j++) {
			for (int i = 0; i < vetorChar.length; i++) {
				if(msg[j] == vetorChar[i]) {
					System.out.println(msg[j] + "=" + vetorCriptografia[i]);

				}
			}
		}
	}
}
