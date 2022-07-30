package collection;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		
		//ArrayList
		
	      //We perform different types of functions on Arraylist
	      //Arraylist<datatypes> object=new Arraylist<datatypes>();
				
				ArrayList<String> obj=new ArrayList<String>();
				
				obj.add("Nilesh");
				obj.add("Avinash");
				obj.add("Akshay");
				System.out.println(obj);
				//String a=obj.get(1);
				//System.out.println(a);
				obj.set(0, "Kiran");
				System.out.println(obj);
				obj.remove(0);
				System.out.println(obj);
				int a=obj.size();
				System.out.println(a);
				obj.remove(1);
				System.out.println(obj);
	}

}
