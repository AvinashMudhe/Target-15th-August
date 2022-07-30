package factorialnum;

public class FactorialNum {

	public static void main(String[] args) {
		//Factorial number
		//For Ex- 5=5*4*3*2*1
		
		int a = 6;
		int fact = 1; // we initialize fact=1, do not initialize 0 boz 0 multiply by any num is= 0 so,

		for (int i = 6; i >= 1; i--) { // for(int i=1; i<=6; i++) this is also correct we can use anyone

			fact = fact * i; // 1*i(6)=6-----6*i(5)=30----30*i(4)=120---120*i(3)=360--360*i(2)=720--720*i(1)=720
		}

		System.out.println(fact);
	}
}
