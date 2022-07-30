package fibonaacinum;

public class Fibonoaccii2 {

	public static void main(String[] args) {
		
		//Fibonoacci
		
		int a=1;
		int b=2;
		
		for(int i=0; i<=10;i++) {

			int c=a+b;
			a=b;
			b=c;
			
			System.out.println(c);
			
		}
		
	}

}
