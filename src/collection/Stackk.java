package collection;

import java.util.Stack;

public class Stackk {

	public static void main(String[] args) {
		
		//Stack
		
		Stack<String> obj=new Stack<String> ();     //LIFO=last in first out
		
		obj.push("Avinash");
		obj.push("Nilu");
		obj.push("Lalu");
		
		System.out.println(obj);
		obj.pop();                           //for remove
		System.out.println(obj);
	
	
	
	}
	
	

}
