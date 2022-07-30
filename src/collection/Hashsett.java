package collection;

import java.util.HashSet;

public class Hashsett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashset
		
		HashSet hs=new HashSet();
		
		//hs.set method is not available in set bcoz of no index----storage type is hashtable

		hs.add("Avi");
		hs.add("Patil");
		hs.add("Shital");
		hs.add("Khushi");
		hs.add("Arakta");
		hs.add("Payal");
		hs.add("Avi");
		hs.add(null);
		hs.add(null);
		System.out.println(hs);

		System.out.println(hs.size());

		System.out.println(hs.contains(null));

	}

}
