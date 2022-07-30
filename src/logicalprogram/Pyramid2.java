package logicalprogram;

public class Pyramid2 {

	public static void main(String[] args) {
		
		for(int i=1; i<=6;i++){    //Same condition  for all logical pattern program 
			
			for(int j=i; j<=6;j++ ) {     //Space increasing condition
				
				System.out.print(" ");
			}
				for(int k=1; k<=i; k++) {    //Space decreasing condition
					System.out.print("*");
				}
				for(int k=1; k<i; k++) {     //This condition and previous condition are same just for prevent match
					System.out.print("*"); 
				}
		System.out.println();     // Only for new line
		}

		}
}


