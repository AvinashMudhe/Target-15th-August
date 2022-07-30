package string;

public class ToFindUpperCaseAndLowerCaase {

	public static void main(String[] args) {
		
		//To find UpperCase & LowerCase Character from String also Calculate Count
		
		String s = "WelcomE To JavA";           //Space considered as lowercase....
		int lowerCase = 0;
		int upperCase = 0;

		for (int i = 0; i<s.length();i++) {
			char ch = s.charAt(i);

			if (ch >= 65 && ch <= 90) {
				upperCase++;
			} else {
				lowerCase++;
			}
		}System.out.println("Number of UpeerCase Character is "+upperCase);
		System.out.println("Number of Lowercase Character is "+lowerCase);
	}

}
