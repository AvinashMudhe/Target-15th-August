package array;

public class a3 {

	public static void main(String[] args) {
		
		//Reverse Array
		
		String[] a= {"Phy", "Chem", "Bio", "Math","History"}; 
		
		int b=a.length;
		System.out.println(b);
		System.out.println(a[4]);
		String c="Chem";
		for(int i=a.length-1; i>=0; i--) {
			System.out.println(a[i]+" ");	
		 
				if(c.equalsIgnoreCase(a[i])) {
			 
					System.out.println(i);
				}
		}
		
		
	}

}
