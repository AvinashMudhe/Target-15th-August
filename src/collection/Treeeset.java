package collection;

import java.util.TreeSet;

public class Treeeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Treeset
		
		TreeSet tset=new TreeSet();
		
		tset.add("abc");
		tset.add("bcd");
		tset.add("cde");
		tset.add("def");
		tset.add("efg");
		tset.add("fgh");
		tset.add("abc");
		//tset.add(null);      show exception
		
		System.out.println(tset);
		System.out.println(tset.size());    //Do not allowed duplicate value
		tset.pollFirst();
		System.out.println(tset);   //Remove first element
		tset.pollLast();
		System.out.println(tset);    //Remove Last element
		
		tset.remove("def");
		System.out.println(tset);
		
		System.out.println(tset.first());   //display information at starting position
		System.out.println(tset.last());    //display information at last position
		
	}

}
