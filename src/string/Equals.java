package string;

public class Equals {

	public static void main(String[] args) {
		//equals-->It returns equality of string with object
	
		String S="India";
		
		String T= "india";
		
		String U="IndiA";
		
		String V= "INDIA";
		
		String W= "india";
		
		System.out.println(S.equals(T));	
		
		System.out.println(T.equalsIgnoreCase(U));
			
		System.out.println(T.equals(U));
		
		System.out.println(T.equals(W));
		}
	
	}
	


