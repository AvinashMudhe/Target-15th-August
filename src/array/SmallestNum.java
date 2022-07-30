package array;

public class SmallestNum {

	public static void main(String[] args) {

		int[] a = { 2, 3, 4, 9, 8, 7, 56, 43, 56, 23, 43, 54, 56, 666, 765, 999 };

		int SmallNum = a[0];

		for (int i = 0; i < a.length; i++) {

			if (SmallNum > a[i]) {
				SmallNum = a[i];
			}
		}
		System.out.println(SmallNum);

	}

}
