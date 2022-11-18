package vowels;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "AviNAsh";
		int UpperCase = 0;
		int LowerCase = 0;
		for (int i = 0; i <= s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 65 && ch <= 90) {
				UpperCase++;

			} else {
				LowerCase++;
			}

			System.out.println(UpperCase);

			System.out.println(LowerCase);
		}
	}
}