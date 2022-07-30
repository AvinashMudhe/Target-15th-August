package hierachical;

public class C extends A {
	
	public void m3() {
		
		System.out.println("I am a younger son");
		
		
	}
	public static void main(String[] args) {
		
		C obj = new C();
		
		obj.m3();
		obj.m1();
	
	}

}
