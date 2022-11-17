package GeneralPackage;

public class Item03 {

	public static void main(String[] args) {

		int firstVetor[] = new int[100];
		int multiplePositives[] = new int[100];
		int positiveNotMultiples[] = new int[100];
		int multipleNegatives[] = new int[100];
		int negativesNotMultiples[] = new int[100];
		int x = 30;
		int y = 150;
		
		for(int i = 0; i < 100; i ++) {
			firstVetor[i] = (int)((Math.random() * y) - x);
		}
		
		System.out.print("\nVector Values: " );
		for(int i = 0; i < firstVetor.length; i ++) {
			System.out.print(firstVetor[i] + " ");
		}
		
		for(int i = 0; i < 100; i++) {
			if(firstVetor[i] % 3 == 0 && firstVetor[i] > 0) {
				multiplePositives[i] = firstVetor[i];
			}else if(firstVetor[i] % 3 != 0 && firstVetor[i] > 0) {
				positiveNotMultiples[i] = firstVetor[i];
			}else if(firstVetor[i] % 3 == 0 && firstVetor[i] < 0) {
				multipleNegatives[i] = firstVetor[i];
			}else if(firstVetor[i] % 3 != 0 && firstVetor[i] < 0) {
				negativesNotMultiples[i] = firstVetor[i];
			}
		}
		
		System.out.print("\na) Positive Numbers Multiples of 3: ");
		for (int i = 0; i < multiplePositives.length; i++) {
			if(multiplePositives[i] != 0) {
				System.out.print(multiplePositives[i] + " ");
			}
		}System.out.print("\nb) Positive Numbers not Multiples of 3: ");
		for (int i = 0; i < positiveNotMultiples.length; i++) {
			if(positiveNotMultiples[i] != 0) {
				System.out.print(positiveNotMultiples[i] + " ");
			}
		}System.out.print("\nc) Negative Numbers Multiples of 3: ");
		for (int i = 0; i < multipleNegatives.length; i++) {
			if(multipleNegatives[i] != 0) {
				System.out.print(multipleNegatives[i] + " ");
			}
		}System.out.print("\nd) Negative Numbers not Multiples of 3: ");
		for (int i = 0; i < negativesNotMultiples.length; i++) {
			if(negativesNotMultiples[i] != 0) {
				System.out.print(negativesNotMultiples[i] + " ");
			}
		}
		System.out.println();
	}
}
