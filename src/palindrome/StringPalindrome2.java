package palindrome;

public class StringPalindrome2 {
	public static void main(String[] args) {
		String s = "MoM";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		if (s.equals(rev)) {
			System.out.println("Palindrome of String");
		} else {
			System.out.println("Nothing");
		}
	}
}