package string;

public class CharOccurance {

	public static void main(String[] args) {

		// Character occurence in string

		String S = "Avinash";
		String t = S.toLowerCase();
		int i = t.length();

		String c = t.replace("a", "");

		int d = c.length();

		int r = i - d;

		System.out.println(r);
	}

}
