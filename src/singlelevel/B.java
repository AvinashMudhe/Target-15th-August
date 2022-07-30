package singlelevel;

public class B extends A {

	public void m2() {
		
		String s= "Mudhe";
		
		System.out.println(s);
		
		
	}
	public static void main(String[] args) {
		
		B obj= new B();
		obj.m1();
		obj.m2();
	}
}
