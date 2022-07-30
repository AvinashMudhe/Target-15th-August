package practice;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//75 to 100
		int count=0;
		for(int i=75; i<=100; i++) {
			
			if(i%2==0) {
				count++;
				System.out.println(i+"Even");
			}
		}
		System.out.println(count);

	}

}
