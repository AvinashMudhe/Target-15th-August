package palindrome;

public class StringPalindrome {

	public static void main(String[] args) {
		
		// Palindrome of String

		String S = "DAD";

		String rev = "";

		for (int i = S.length() - 1; i >= 0; i--) {

			rev = rev + S.charAt(i);
		}
		System.out.println(rev);

		if (S.equals(rev)) {
			System.out.println("This is Palindrome String");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
