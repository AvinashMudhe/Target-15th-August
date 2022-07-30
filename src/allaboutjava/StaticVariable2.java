package allaboutjava;

public class StaticVariable2 {
	
	//  static variable declared inside the class and outside the method

	static int Num = 77;
	static String Voter = "Shivsena";
	static int b = 66;
	static int voting=65;
	static String z="Rastrawadi";

	public static void main(String[] args) {
		// Direct calling does not need to create object of class
		// class name.variable name
		
		System.out.println(StaticVariable2.Num);

		System.out.println(StaticVariable2.Voter);
		
		System.out.println(StaticVariable2.voting);
		
		System.out.println(StaticVariable2.z);
		
		System.out.println("**********");
		
		System.out.println("Shivsena win MaNaPa");
		
	}
	

}
