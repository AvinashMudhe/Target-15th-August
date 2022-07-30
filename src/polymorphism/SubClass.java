package polymorphism;

public class SubClass extends SuperClass {

	public void show(long a, float b, String s) {
		
	System.out.println("I am son");
		
	}
	public static void main(String[] args) {
		
		//Obhect creation of Subclass 
		
		SubClass oo = new SubClass();
			
		oo.show(777, 22.5f,"Avi");
	}
}
