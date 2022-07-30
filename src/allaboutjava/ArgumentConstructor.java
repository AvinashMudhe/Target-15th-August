package allaboutjava;

public class ArgumentConstructor {
	// This is a type of User defined Constructor
	// In that we can provides arguments/parameters
	public ArgumentConstructor(int a, String name, int b, int s, long l, float f, double d, boolean m, long n) {

		System.out.println(a);
		System.out.println(name);
		System.out.println(b);
		System.out.println(s);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(m);
		System.out.println(n);

	}

	public static void main(String[] args) {

		// obj Creation

		ArgumentConstructor AC = new ArgumentConstructor(7, "avinash", 11, 6, 777, 16.66f, 777, false, 2);

	}

}
