package logicalprogram;

public class PrimeNum {

	public static void main(String[] args) {
		
		int a=23;
		
	//	String s="It is a prime Number ";
		
		for(int i=2; i<11; i++) {
			
			if(a%i==0) {
				
			//	s="it is not prime number";
				break;
			}
		}
		
			System.out.println(a);
	}

}
