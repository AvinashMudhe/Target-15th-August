package logicalprogram;

public class HillPattern {

	public static void main(String[] args) {
		
		// Hill Pattern
		int n = 5;
		for (int i = 1; i <= n; i++) {           // Same for all type of Pattern (for row)

			for (int j = i; j <= n; j++) {       // this is for column/ Decreasing Space

				System.out.print(" ");
			}

			for (int k1 = 1; k1 <= i; k1++) {    //Increasing Star

				System.out.print("*");
			}

			for (int k2 = 1; k2 < i; k2++) {      //Increasing Star only change is k<=i to k<i 

				System.out.print("*");
			}
			System.out.println();                 //For next line
		}
	}
}
