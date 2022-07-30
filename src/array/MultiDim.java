package array;

public class MultiDim {

	public static void main(String[] args) {
		
		//Multidimensional Array--->>> Means multiple rows and multiple columns
		
		//Declaration of Array
		
		int[][] a; //single dimensional array
		
		//int[][] b;  //Two dimensional Array
		
		//Creation of Array
		
		a= new int[3][3];
		
		//Initialization of Array
		
		//     0     1     2
		//0    10    20    30
		//1    40    50    60
		//2    70    80    90
		
		a[0][0]=10;
		
		a[0][1]=20;
		
		a[0][2]=30;

		a[1][0]=40;

		a[1][1]=50;

		a[1][2]=60;
		
		a[2][0]=70;

		a[2][1]=80;

		a[2][2]=90;

		System.out.println(a[1][2]);
	
	    }
	}


