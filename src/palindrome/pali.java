package palindrome;

public class pali {

	public static void main(String[] args) {

		int a = 131;
		int temp = a;
		int rem;
		int rev = 0;

		while (a != 0) {

			rem = a % 10;
			rev = rev * 10 + rem;
			a = a / 10;
		}

		if (temp == rev) {

			System.out.println("This is Palindrome num");

		}

		else {

			System.out.println("This is not Palindrome num");
		}

	}

}
