package array;

public class LargestNum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] a= {1,4,8,11,14,17,21,25};
			int Large=a[0];  //Assume a[0] is larger
			
			for(int i=0; i<a.length;i++) {
				
				if(Large<a[i]) {
					Large=a[i];
				}
			}
			System.out.println(Large);
	}

}
