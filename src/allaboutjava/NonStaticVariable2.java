package allaboutjava;

public class NonStaticVariable2 {
	
	// nonstatic variable Declare inside the class and outside the method
	
	 String Name="Avinash";
	 int totalmarks=450;
	 int num=41;

	public static void main(String[] args) {

		//Create an object
		//Class name ref var= new Class name ();
		
		NonStaticVariable2 aa=new NonStaticVariable2();
		
		// Printing 
		System.out.println(aa.Name);
		System.out.println(aa.totalmarks);
		System.out.println(aa.num);
			
	}

}
