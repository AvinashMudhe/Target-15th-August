package reverse;

public class mock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Java";
		String rev="";
		for(int i=s.length()-1; i>=0; i--){

		rev= rev+s.charAt(i);


		}
		System.out.print(rev);

	}

}
