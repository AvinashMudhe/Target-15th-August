package kewords;

public class Finall {
	
	//Final: Final keyword is used to maintain a privacy, once we declare keyword as a final then we can not change
	//Means it is fixed
	//EX. Gravity, Pi, Density or Unique Values(Adhar num, Pan Num, Employment id) we declare as a final by using final keyword
	
	final static int i =10;
	
	final static float f= 12.12f;
	
	public static void main(String[] args) {

		int b= i+12;    // It means change but in same class it just work like private access modifier, 
		                //but outside the class we cant change its value
		
		float g=f-10;    
		
		System.out.println(b);
		
		System.out.println(g);
		
	}

}
