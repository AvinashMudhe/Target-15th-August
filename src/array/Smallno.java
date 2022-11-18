package array;

public class Smallno {

	public static void main(String[] args) {
		// find out the Smallest no
		int [] a= {7,4,24,1,34,3};
		int small=a[0];
		for(int i=0;i<a.length;i++) {
			if(small>a[i]) {
				small=a[i];
			}
		} System.out.println(small);
	}

}
