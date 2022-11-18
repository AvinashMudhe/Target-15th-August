package array;

public class LargestNumber {

	public static void main(String[] args) {
		// Large Number
		int[] a = { 1, 3, 5, 7, 9, 11 };
		int Large = a[0];

		for (int i = 0; i < a.length; i++) {

			if (Large < a[i]) {
				Large = a[i];
			}
		}
		System.out.println(Large);
	}
}
