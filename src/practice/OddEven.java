package practice;

public class OddEven {

	public static void main(String[] args) {
		
		//To print Odd num And even
		//int a=88;
		int count=0;
		int count1=0;
		for(int i=0; i<=50; i++) {
			
			if(i%2==0) {
				count++;
				System.out.println(i+"This is Even Number");
			}
			else {
				count1++;
				System.out.println(i+"This is odd number");
			}
		}
		       System.out.println(count);
		       System.out.println(count1);
	}

}
