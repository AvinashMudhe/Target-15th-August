package reverse;

public class RevrseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=121;
		int temp=a;
		int rev=0;
		int rem;
		
		
		while(a>0) {
			 rem=a%10;
			 rev=rev*10+rem;
			 a=a/10;
		
		}
		System.out.println(rev);
		if(temp==rev) {
			System.out.println("Correct");
		}
		else {
			System.out.println("Wrong");
		}
	}

}
