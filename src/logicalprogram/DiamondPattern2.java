package logicalprogram;

public class DiamondPattern2 {

	public static void main(String[] args) {
		
		//Diamond Pattern
		int n= 5;
		for(int i=1; i<=n; i++) {
			
			for(int j=i; j<=n; j++) {
				
				System.out.print(" ");
			}
				for(int j1=1; j1<=i; j1++) {
					System.out.print("*");
				}
					for(int j1=1; j1<i; j1++) {
						System.out.print("*");
					}
					System.out.println();
		}
			for(int i=n; i>=1; i--) {
			
				for(int j=i; j<=n; j++) {
				
				System.out.print(" ");
			}
						for(int j1=1; j1<=i; j1++) {
								System.out.print("*");
				}
							for(int j1=1; j1<i; j1++) {
									System.out.print("*");
					}
					System.out.println();
			}
	}}
	

