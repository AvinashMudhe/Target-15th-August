package practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s="Maharastra";
		 String p="";
		 for(int i=s.length()-1; i>=0; i--) {
			 p= p+s.charAt(i);
			//System.out.println(s.charAt(i));
		 }
		 System.out.println(p);
	}

}
