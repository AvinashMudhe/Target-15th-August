package reverse;

public class PrimeNum {

	public static void main(String[] args) {

		// To print prime Number

		int a = 7;
		int count = 0;

		for (int i = 2; i < a; i++) {

			if (a % i == 0) { // 0==0

				count++; // 1
			}
		}
		if (count == 0) { // 0==0

			System.out.println("Prime num");
		}

		else {

			System.out.println("Not Prime num");
		}
	}

}
