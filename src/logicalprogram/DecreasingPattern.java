package logicalprogram;

public class DecreasingPattern {

	public static void main(String[] args) {
		
		//Decreasing Pattern
		
		for(int i= 1; i<=4; i++) {
			
			for(int j =4; j>=i; j--) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
	}

}
