package allaboutjava;

public class Important {
	// local variable
	static int a = 77;
	String Name = "Avinash";
	int d = 44;

	public void m1() {
		// Non static method
		int d = 97;
		System.out.println(d);
		System.out.println(this.d);
	}

	public static void m2() {
		// static method
		double d = 97.97;
		int a = 76;
		int b = 74;
		int c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		m2();
		
		Important bb=new Important();
		bb.m1();
	}

}
