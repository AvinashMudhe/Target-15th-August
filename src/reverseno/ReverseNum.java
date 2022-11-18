package reverseno;

import java.util.Arrays;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=123;
		int rev=0;
		int rem;
		
		while(a!=0) {
			rem=a%10;
			rev= rev*10+rem;
			a=a/10;
	
		}
		System.out.println(rev);
	}
}
