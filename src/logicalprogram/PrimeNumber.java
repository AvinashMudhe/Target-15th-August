package logicalprogram;

public class PrimeNumber {

	public static void main(String[] args) {
		
		// To Print Prime Number

		int no = 7;
		int count = 0;
		for (int i = 1; i <= no; i++) {
			if (no % i == 0) {
				count++;
				System.out.println(i); // for printing which number is divided to num 16
			}
		}
		if (count == 2) {
			System.out.println("This is Prime Number");
		} else {
			System.out.println("This is Not Prime Number");
		}
	}
}
