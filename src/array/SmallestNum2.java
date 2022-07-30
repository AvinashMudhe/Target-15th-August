package array;

public class SmallestNum2 {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int Small = a[0];
		for (int i = 0; i < a.length; i++) {
			if (Small > a[i]) {
				Small = a[i];
			}
		}
		System.out.println(Small);
	}
}
