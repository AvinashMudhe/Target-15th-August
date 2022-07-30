package polymorphism;

public class Methodoverriding2 extends Methodoverriding1 {

	public void m1(int a) {     //For Overriding Method Only taken non static method
		System.out.println("Subclass1");
	}
	public void m2(int a, int b) {
		System.out.println("Subclass2");
	}
	public static void main(String[] args) {
		Methodoverriding2 ss=new Methodoverriding2();
		ss.m1(2);
		ss.m2(1, 3);    //We get output from Subclass i.e. Subclass is overridden to Superclass 
	}
}
