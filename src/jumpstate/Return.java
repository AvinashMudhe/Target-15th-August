package jumpstate;

public class Return {

	public static void main(String[] args) {
		// Return; jumping statements

		// in this type of jumping statements once condition meets/true then it goes to
		// main method and exit from code/block
		// In another if condition not meets/false then it executes next code

		for (int a = 2; a <= 10; a++) {

			System.out.println(a);

			if (a == 11) {

				return;
			}
		}
		System.out.println("Avinash is an Enginner");
	}

}
