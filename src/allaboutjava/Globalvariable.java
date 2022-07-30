package allaboutjava;

public class Globalvariable {
	//Global Variables
	
	 static int a = 19;

	public void test() {
		//NonStatic Variables
		int b = 25;
		System.out.println(a);
	}

	public static void test1() {
		//Static variable
		int c = 26;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Globalvariable ss=new Globalvariable();
		ss.test();
		
		System.out.println(a);
		
		test1();
		
		Globalvariable zz=new Globalvariable();
		
		zz.test();
	}
}
