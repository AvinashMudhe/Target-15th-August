package Interview;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=121;
		int temp=a;
		int rev=0;
		int rem;

		while(a!=0){
		rem=a%10;
		rev=rev*10+rem;
		a=a/10;

		}
		if(rev==temp){
		System.out.println("Yes");
		}
		else{
		System.out.println("No");
		}

	}

}
