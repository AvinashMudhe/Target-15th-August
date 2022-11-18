package fibonaacinum;

public class FibnoaaciSeries {

	public static void main(String[] args) {

		// To write FibnoaaciSeries

		// Series ==> 0--1--1--2--3--5--8---13--21--34--55--

		// 0+1=1--> 1+1=2-->1+2=3-->2+3=5-->3+5=8-->5+8=13-->

		// 0=a; 1=b;---1=a; 1=b;--a=2; b=3

		int a = 0;
		int b = 1;
	    System.out.println(a);
		System.out.println(b);
		for (int i = 0; i <= 3; i++) {
			int c = a + b; // 1, 2, 3, 5, 8, 13
			a = b;  //1, 1, 2, 3, 5
		    b = c;  //1, 2, 3, 5, 8
			System.out.println(c);
			
			
		}
	
	}

}
