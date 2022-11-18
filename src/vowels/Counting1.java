package vowels;

public class Counting1 {
	public static void main(String[] args) {
		String s="NileshuoaoaoaoAUE";
		int Count=0;
		char ch=0;
		 s=s.toLowerCase();
			for (int i = 0; i < s.length(); i++) {
				ch = s.charAt(i);

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					Count++;
				}

			}
			System.out.println(Count);

		}
	}
