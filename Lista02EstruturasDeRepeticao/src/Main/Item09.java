package Main;

public class Item09 {

	public static void main(String[] args) {

		int i = 0;
		int j = 30;
		for(;i < 27; i += 2) {
			System.out.println(i + " - " + (j += 3));
		}
	}

}
