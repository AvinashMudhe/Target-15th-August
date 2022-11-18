package vowels;

public class Countt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Avinashaa";
		
		int Count=0;
		s=s.toLowerCase();
		
		for(int i=0; i<s.length(); i++) {
			
			char ch= s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
				Count++;
			}
		}
		System.out.println(Count);
	}

}
