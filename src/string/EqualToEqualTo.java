package string;

public class EqualToEqualTo {

	public static void main(String[] args) {
		//== 
		
		String S = "India is my Country";

		String T = "India is my Country";

		String U = "India is State";

		String V = "India is District";

		if (S == T || S != V) {

			System.out.println("This is Correct");

		}

		if (T != U) {

			System.out.println("This is right");

		}
	
		else {

			System.out.println("This is Incorrect");
		}
	}

}
