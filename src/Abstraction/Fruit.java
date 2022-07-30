package Abstraction;

public abstract class Fruit {    //We can declare abstract as well as non abstract method in abstract class
	
	abstract void taste();     // Incomplete method or Abstract method bcoz body/ defn is not present
	
	void eat() {               // Complete method or Concrete method 
		
		System.out.println(" I eat a mango");
		
		System.out.println("Mango is king of Fruit");
	}


}
