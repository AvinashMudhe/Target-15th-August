package practice;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=151;
		int a=no;
		int rev=0;
		int rem;
		
		while(a!=0) {
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		if(no==rev) {
		System.out.println("Palindrome Number");
	}
	else {
		System.out.println("Not Palindrome Num");
	}
}
}