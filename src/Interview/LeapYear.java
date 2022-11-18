package Interview;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2036;

		if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
			System.out.println("Laep Year");
		} else {
			System.out.println("No");
		}

	}

}
