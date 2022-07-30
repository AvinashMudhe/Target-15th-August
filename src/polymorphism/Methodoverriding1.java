package polymorphism;
	//Superclass and subclass having same method name then subclass acquire the properties of superclass
	// and changes its body according to subclass specifications

public class Methodoverriding1 {

	public void m1(int a) {     //In method Overriding, only use non static method
		System.out.println("Superclass1");
	}
	public void m2(int a, int b) {
		System.out.println("Superclass2");
	}
	}

