package reverse;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int a=1234;
		int temp=a;   // int temp=121;
		int rem;
		int rev = 0;
		
		
		while(a!=0)
		{
	    rem=a%10; //1, 2, 1
		rev=rev*10+rem; //1, 12, 121
		a=a/10;  //12, 1, 0
		}
		System.out.println(rev);
	}

}
