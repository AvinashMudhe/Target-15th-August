package leapyear;

public class Leapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2033;
		
		if(year%4==0||year%400==0||year%100==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}

	}

}
