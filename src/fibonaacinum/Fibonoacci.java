package fibonaacinum;

public class Fibonoacci {

	public static void main(String[] args) {

		// Fibonoacci num

		int a = 1;
		int b = 2;

		for (int i = 0; i <= 15; i++) {

			int c = a + b;
			a = b;
			b = c;

			System.out.println(c);
			}
	}
}
