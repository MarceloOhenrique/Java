package Main;

public class Item06 {

	public static void main(String[] args) {

		int i = 0;
		int j = 33;
		for(;i < 100 && j < 66; i++) {
			System.out.println(i + " - " + j--);
		}
	}
}
