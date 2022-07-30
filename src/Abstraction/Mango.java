package Abstraction;

 public class Mango extends Fruit {     // Concrete class provides the body to  an incomplete method 
	
	void taste() {                    //This method is completed by providing a body 
		
		
		System.out.println(" Mango is sour");
	}

	public static void main(String[] args) {
		
		//object
		
		Mango m= new Mango();
		
		m.taste();
		m.eat();
	}

}
