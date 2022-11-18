package vowels;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String s="Welcome";
			String s1=s.toLowerCase();
			int Count=0;
			
			for(int i=0; i<=s1.length()-1;i++) {
				
				char ch=s1.charAt(i);
				
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					Count++;
				}
			}
			System.out.println(Count);
	}

}
