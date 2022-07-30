package palindrome;

public class PalindromeNumber1 {

	public static void main(String[] args) {
		
		// To fin out the PalindromeNumber1
		
		int a=171;
		int no=a;
		int rev=0;     
		int rem;
		
		while(no!=0) {
			rem=no%10;       //1----7-----1
			rev=rev*10+rem;   //1----17----171
			no=no/10;    //17------1----0
		}
		
		System.out.println(rev);	

		if(a==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		
		
		
		
		
		
		
		
		
	}

}
