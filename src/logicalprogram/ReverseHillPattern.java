package logicalprogram;

public class ReverseHillPattern {

	public static void main(String[] args) {
		
		//Reverse Hill Pattern
		
		int n=5;
		for(int i=1; i<=n; i++) {             //Same for all type of pattern/ for row
			
			for(int j=1; j<=i; j++) {         //this is for column/ Increasing Space
				System.out.print(" ");	
			}
			for(int j1=i; j1<=n; j1++) {      // Increasing Star
				System.out.print("*");
			}
				for(int j2=i; j2<n; j2++) {   //Increasing Star
					System.out.print("*");
				}
					System.out.println();     //For next line
		}			
		
	}

}
