package reverseno;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//For printing Reverse Number 
		//same like palindrome Number just not req temp variable
		int a = 321;
		int rev = 0;
		int rem;
		//int temp = a; ------ Not required 

		while (a != 0) { // we can also use this---while(a>0); result of both are same.
			rem = a % 10;
			rev = rev * 10 + rem;
			a = a / 10;
		}
		System.out.println(rev);

	}
}

