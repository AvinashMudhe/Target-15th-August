package vowels;

public class Counting {
		public static void main(String[] args) {
			String s="Avinashiiiiiiiuuuuoooeee";
			int Vowels=0;
			s=s.toLowerCase();
			for(int i=0;i<s.length(); i++) {
				char ch=s.charAt(i);
				
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					Vowels++;
				}
			}
			System.out.println(Vowels);

		}

}
