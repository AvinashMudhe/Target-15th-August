package allaboutjava;

public class NonStaticVariable {
	
	// Nonstatic Variable is declared inside the class but outside the method
	//Nonstatic method is type of regular methods
	// Non static variables does contains static keywords
	
	public void m2() {
		
		int a= 25;
		int b= 60;
		int c= a/b;
		int d= a+b;
		int e=a*b;
		
		System.out.println(c);
		
		System.out.println(d);
		
		System.out.println(e);
	}
	public static void main(String[] args) {
		
		//For calling to nonstatic method we have to create object first by using class name
		
		NonStaticVariable a= new NonStaticVariable();
		
		a.m2();
		
	}

}
