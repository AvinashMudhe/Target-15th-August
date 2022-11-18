package vowels;

public class Consonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="RAMAANA";
		s=s.toLowerCase();
		int vowels=0;
		int Consonent=0;
		
		for(int i=0; i<s.length(); i++) {
			char ch= s.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels++;
			}
			else
			{
				Consonent++;
			}
		}
		System.out.println(vowels);
		System.out.println(Consonent);
	}

}
