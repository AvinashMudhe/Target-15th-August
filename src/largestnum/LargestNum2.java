package largestnum;

public class LargestNum2 {

	public static void main(String[] args) {
		
		//Find out largest number by using Another(Ternary Operator) method
		
		int a = 999;
		int b = 777;

		int c = a > b ? a : b; // Standard Derivation
		int d = a < b ? a : b;
		System.out.println("The largest num is " + c);
		System.out.println("The Smallest num is " + d);
	}

}
