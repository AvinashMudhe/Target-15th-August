package array;

public class largestNum2 {

	public static void main(String[] args) {

		int[] a = { 1, 5, 9, 3, 55, 88, 76, 98, 34, 65 };  //initialize an array

		int max = a[0];                         //Just create an array

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {                 //put condition 

				max = a[i];                   //if condition is true then again gone to 
				                             //for loop and increase the value of i 
			}
		}
		System.out.println(max);

	}

}
