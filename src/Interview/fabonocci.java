package Interview;

public class fabonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0; i<=5; i++){
		int c=a+b;
		b=c;
		a=b;
		System.out.println(c);
		}
	}

}
