package leapyear;

public class LeapYear {

	public static void main(String[] args) {
		
		//Leap Year
		
		int year= 2032;
		
		if( year % 4==0 || year % 400==0 || year % 100==0) {    //Condition of leap year
			
			System.out.println(" This is Leap Year");
			
		}
		else {
			System.out.println("This is not Leap Year");
		}
	}

}
