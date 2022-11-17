package GeneralPackage;

public class Item11 {

	public static void main(String[] args) {
		
		int matrix[][] = {{5, 1}, 
						  {4, 3},
						  {6, 5}};
	
		for (int j = 0; j < 2; j++) {
			int x = 2;
			System.out.print("[");
			for (int i = 0; i < 3; i++) {
				System.out.print(matrix[x][j]);
				if(i < 2) {
					System.out.print(',');
				}
				x--;
			}
			System.out.print("]");
			System.out.println();
		}
	}

}
