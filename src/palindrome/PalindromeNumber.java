package palindrome;

public class PalindromeNumber {

	public static void main(String[] args) {

		int a=121;
		int temp=a;   // int temporary=121;
		int rem;
		int rev = 0;  
		
		while (a != 0) {
			rem = a % 10; // 1, 2, 1
			rev = rev * 10 + rem; // 1, 12, 121
			a = a / 10; // 12, 1, 0
		}

		if (temp == rev) {
			System.out.println("This is Pallindrome number");
		}

		else {
			System.out.println("Not pallindrome Number");
		}
	}
}
