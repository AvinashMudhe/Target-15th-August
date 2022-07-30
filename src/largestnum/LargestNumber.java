package largestnum;

public class LargestNumber {

	public static void main(String[] args) {
		
		//	To find out largest number by using if else
		
		int a=899;
		int b= 77;
		
		if(a>b) {
			
			System.out.println(" a is greater");
			
		}
		else {
			
			System.out.println("b is greater ");
		}
		
		//Another way to find out largest number
		
		int c=a>b?a:b;   // ? is ternary operator// another method
		System.out.println("The greater num is "+ c);
	}

	  
}
