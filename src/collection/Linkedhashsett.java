package collection;

import java.util.LinkedHashSet;

public class Linkedhashsett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add("Avi");
		lhs.add("Patil");
		lhs.add("Shital");
		lhs.add("Khushi");
		lhs.add("Arakta");
		lhs.add("Payal");
		lhs.add("Avi");
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);     //Maintain Order
		
		System.out.println(lhs.size());   //Duplicate not allowed and also only one null value allowed
		
	}

}
