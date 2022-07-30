package array;

public class LargestNum {

	public static void main(String[] args) {
		
		int[] a = { 2, 4, 6, 8, 9, 65, 78, 4, 5, 65, 99};
		int Large = a[0];
  
		for (int i = 0; i < a.length; i++) {

			if (Large < a[i]) {

				Large = a[i];
			}
		}
		System.out.println("Largeest num is "+Large);
	}
}