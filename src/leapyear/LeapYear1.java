package leapyear;

public class LeapYear1 {

	public static void main(String[] args) {
		// Leap Year;

		int Year = 2033;
		if (Year % 4 == 0 || Year % 400 == 0 || Year % 100 == 0) {

			System.out.println("This is Leap Year");

		} else {
			System.out.println("This is not Leap Year");
		}
	}

}
