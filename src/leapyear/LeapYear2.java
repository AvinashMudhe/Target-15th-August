package leapyear;

public class LeapYear2 {
	
	public static void main(String[] args) {
		
		int Year= 2032;
		if(Year%4==0||Year%100==0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not Leap Year");
		}
	}

}
