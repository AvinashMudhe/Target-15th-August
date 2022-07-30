package multilevelinheritance;

public class C extends B {

	public  void m3() {
		
		System.out.println("Patil");
	}
	
	public static void main(String[] args) {
		
		C obj=new C();
		obj.m1();
		obj.m2();
		obj.m3();
		
	}
}
