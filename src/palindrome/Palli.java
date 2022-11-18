package palindrome;

public class Palli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=543;
		int temp=a;
		int rev=0;
		int rem;
		
		while(a>0) {
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
			
		}
		if(temp==rev) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
