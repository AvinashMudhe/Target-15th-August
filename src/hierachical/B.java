package hierachical;

public class B extends A {
	
	public static void m2() {
		
		System.out.println("i am elder son");
		
	}
	public static void main(String[] args) {
		 B obj=new B();
		 
		 obj.m1();
		 obj.m2();
	}
}
