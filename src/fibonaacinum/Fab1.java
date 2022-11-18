package fibonaacinum;

public class Fab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0; // 0,1,1,2,3,5
		int b = 1;
		System.out.println(a);
		System.out.println(b);

		for (int i = 0; i <= 3; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}

}
