package polymorphism;

public class CompileTime1 {
	
	// Method overloading--> In a same class, method name should be same with different arguments is called as Method Overloading
	//In Method overloading, use Static as well as non static methods
	public void show(int model, long Price, String company) {
		
		System.out.println(2014);
		System.out.println(6500000);
		System.out.println("Audi-Q7");
		System.out.println(" Audi-Q6");
	}
	
	public void show(String Bike, int model, int Avg) {
		
		System.out.println(" FZ-S");
		
	}
	public static void main(String[] args) {
		
		//Object Creation 
		
		CompileTime1 vehicle =new CompileTime1();
		
		//Calling
		
		vehicle.show(2013, 7000000, "AUDI-AG");
		vehicle.show ("Yamhaa", 2019, 47);
	}

}
