package collection;

import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {

			//LinkedList
		
	//	LinkedList<datatype> obj=new LinkedList<datatype>();
		
		LinkedList<String> obj=new LinkedList<String>();
		
		obj.add("Nilesh");
		obj.add("Avinash");
		obj.add("Akshay");
		System.out.println(obj);
		obj.addFirst("Ram");
		System.out.println(obj);
		obj.addLast("kiran");
		System.out.println(obj);
		obj.add(3, "Pandit");
		System.out.println(obj);
		obj.remove(2);
		System.out.println(obj);
		obj.removeFirst();
		System.out.println(obj);
		obj.removeLast();
		System.out.println(obj);
		obj.remove(1);
		System.out.println(obj);
		
		
		//By using for loop
		
		for(String S:obj) {
			System.out.println(S);
		}
		
		
		
		
		
		
	}

}
