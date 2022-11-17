package Main;

public class Item07 {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		for(;i < 101 && j < 303; j += 3) {
			System.out.println((i++) + " - " + j );
		}
	}

}
