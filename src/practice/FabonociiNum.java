package practice;

public class FabonociiNum {

	public static void main(String[] args) {
		
		//Fabnocii means====> we req 3 variable bcoz 2 are req for initialization and nxt is for addition
		
		int a = 1;
		int b = 2;
		int i = 0;
		while (i <= 5) {       //we use while loop bcoz we dont know no of iteration
			int c = a + b;
			a = b;
			b = c;
			i++;
			System.out.println(c);
		}
	}
}
