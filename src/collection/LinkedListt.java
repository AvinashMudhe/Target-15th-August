package collection;

import java.util.LinkedList;

public class LinkedListt {

	public static void main(String[] args) {

		// LinkedList

		LinkedList ll = new LinkedList();

		ll.add("avi");
		ll.add("dada");
		ll.add("soma");
		ll.add("baba");
		ll.add("avi");
		ll.add(null);
		ll.add(null);
		System.out.println(ll);

		ll.add(3, "Sanju");
		System.out.println(ll);

		ll.set(2, "Babu");
		System.out.println(ll); // Set replace karto

		ll.remove(1);
		System.out.println(ll);

	}

}
