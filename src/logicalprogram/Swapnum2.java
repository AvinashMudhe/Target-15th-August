package logicalprogram;

public class Swapnum2 {

	public static void main(String[] args) {

		// With using Third Variable

		int a = 20;
		int b = 30;

		int c = a; // c=20 c is taken as third variable

		a = b;
		b = c;

		System.out.println("a is " + a);
		System.out.println("b is " + b);
	}
}
