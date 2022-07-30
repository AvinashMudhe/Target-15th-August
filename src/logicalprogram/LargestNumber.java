package logicalprogram;

public class LargestNumber {

	public static void main(String[] args) {
		
		//To find out Largest Number
		
		int a=95;
		int b=35;
		int c=45;
		
		//For finding largest number we use nested loop/ifelseif loop by using Logical &&

		if(a>b && a>c) {
			System.out.println("a is greater than b and c");
		}
		
		else if (b>a && b>c) {
			System.out.println("b is greater than a and c");
		}
		
		else {
			System.out.println("c is greter than a and b");
		}
		
		
	}

}
