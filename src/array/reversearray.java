package array;

public class reversearray {

	public static void main(String[] args) {

		// To print a reverse array

		int[] a = { 1, 25, 66, 34, 98 };

		for (int i = a.length - 1; i >= 0; i--) {

			System.out.println(a[i]);            // In printing statement not putting only i instead of
										        // that put a[i]
		}
	}
}
