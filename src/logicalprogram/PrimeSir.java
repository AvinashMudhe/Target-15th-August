package logicalprogram;

public class PrimeSir {

	public static void main(String[] args) {
		
		//Prime no
		
		int a=5;
		int b=0;
		
		for(int i=2; i<5;i++) {
			
			if(a%i==0) {
				b=b++;       //b=b+1;
			}
		}
			if(b==0) {
				System.out.println(a+" is prime number");
			}
			else {
				System.out.println(a+" is not prime number");
			}
	
	}

}
