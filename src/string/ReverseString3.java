package string;

public class ReverseString3 {

	public static void main(String[] args) {
		
		//Reverse String
		
		String s="Automation";
		
		String t=" ";
		
		for(int i=s.length()-1; i>=0; i--) {
			
			t=t+s.charAt(i);
		}
			System.out.println(t);
	
		if(s==t) {
			
			System.out.println("pali");
		}
		else {
			System.out.println("Not pali");
		}
		}
}
