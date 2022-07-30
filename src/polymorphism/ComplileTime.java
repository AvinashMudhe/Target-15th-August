package polymorphism;

public class ComplileTime {
	
	// Method Overloading-->In same class, Method name should be same with different 
	//arguments/parameters is called as method overloading 

	public void show(String s, int Model) {   //String argument, int argument also we can add numbers of datatypes

		System.out.println("Baleno");

	}
	public void show(long Price, String s) {   // long, String argument

		System.out.println("Harrier");

	}
	public static void main(String[] args) {

		// Creation of object

		ComplileTime car = new ComplileTime();

		car.show("Maruti", 2120);       //Object name of reference variable.method name
		car.show(2500000, "Tata");      //Object name of reference variable.method name

	}

}
