package vowels;

public class Counts {

	public static void main(String[] args) {

		// To find out Counts

		String s = "Maharastara";

		int vowel = 0; // Declaration

		s = s.toLowerCase(); // Bcoz it is case sensitive thats why firstly convert into lowercase

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i); // For finding length
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { // For Compairing

				vowel++; // For increasing
			}

		}
		System.out.println(vowel);

	}
}
