package array;

public class LargeNum {

	public static void main(String[] args) {

		int []a= {1,2,3,4,5,6,7,8,999};
		
		int LargeNum=a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(LargeNum<a[i]) {
				LargeNum=a[i];
			}
		}
		System.out.println(LargeNum);
	}

}
