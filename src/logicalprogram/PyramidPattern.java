package logicalprogram;

public class PyramidPattern {

	public static void main(String[] args) {
		
		//pyramid Pattern By using for loop
		
		for (int i = 1; i <=5; i++) { // row

			for (int j = i; j <=5; j++) { // column
				System.out.print(" ");
			}

				for (int k = 1; k < i; k++) { //

					System.out.print("*");
				}
				for(int k = 1; k <= i; k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
	}


