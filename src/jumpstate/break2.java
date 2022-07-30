package jumpstate;

public class break2 {

	public static void main(String[] args) {
		// break;
		// In this type of jumping statements, once code executed/conditions meet then
		// exit from loop but execute outside the codes

		for (int z = 11; z <= 22; z++) {

			System.out.println(z);

			if (z == 16) {
				return;
			}

		}

		System.out.println("Avinash is Boy");
	}

}
