package practice;

public class B {

	public static void main(String[] args) {
		
		String S="MOM";
		String rev="";
		
		for(int i=S.length()-1; i>=0; i--) {
			
			//System.out.print(S.charAt(i));
			 rev =rev+S.charAt(i);	
			
			}
		System.out.println(rev);

		if(S.equals(rev)) {
			System.out.println("Pali");
		}
		else {
			System.out.println("Not");
		}
		}
	}
		