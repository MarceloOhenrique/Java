package Main;

public class Item14 {

	public static void main(String[] args) {

		contagemDeCaracteres();
	}
	
	public static void contagemDeCaracteres() {
		
		String caracteres[] = {"a", "b", "c", "3", "3", "5", "a", "c"};
		int contador = 0;
	
		for(int i = 0; i < caracteres.length; i++) {
			for(int j = 0; j < caracteres.length; j++) {
				if(caracteres[i] == caracteres[j]) {
					contador++;
				}
			}
			System.out.print(caracteres[i] + "=" + contador + " ");
			contador = 0;
		}	
	}
}
