package logicalprogram;

public class SwapNum {

	public static void main(String[] args) {
		
		//Swapping of Number without using third variable
		
		int a=20;
		int b=30;
		a=a+b;    //a=50
		b=a-b;    //b=50-30==20
		a=a-b;    //50-20==30
		
		System.out.println("a is "+a);
		
        System.out.println("b is "+b);	
	}

}
