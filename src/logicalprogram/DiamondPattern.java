package logicalprogram;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("inter number of iteration");
		int n=sc.nextInt();
		//Diamond pattern
	
	//int n=5;
	
	for (int i=1; i<=n; i++) {
		// for print spaces
		for(int j=1; j<=n-i; j++) {
			System.out.print(" ");
		}
		// for print star
		for(int k=1; k<=(i*2)-1; k++) {
			System.out.print("*");
		}
		
		
		System.out.println();
	}
	for (int i=n; i>=1; i--) {
		// for print spaces
		for(int j=1; j<=n-i; j++) {
			System.out.print(" ");
		}
		// for print star
		for(int k=1; k<=(i*2)-1; k++) {
			System.out.print("*");
		}
		
		
		System.out.println();
	}
	
	}	
}
//				i run from 	i=1 to i=n
//								
//			k run from	k=1  to k<=i*2-1	j run from	j=1 to j<=n-i			value of i during loop
//    *				star=1--	i*2-1			space=4--n-1						i=1
//   ***			star=3--	i*2-1			space=3--n-2						i=2
//  *****			start=5--	i*2-1			space=2--n-3						i=3
// *******			star=7		i*2-1			space=1--n-4						i=4
//*********			star=9		i*2-1	 		space=0--n-5						i=5