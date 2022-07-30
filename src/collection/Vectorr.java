package collection;

import java.util.Vector;

public class Vectorr {

	public static void main(String[] args) {
		
		//Vector
		
		Vector v=new Vector();
		
		v.add("Avi");
		v.add("Nilu");
		v.add("Akki");
		v.add("Patil");
		v.add("Ram");
		v.add("Raje");
		v.add("Shiva");
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.contains("Ram"));
		System.out.println(v.get(1));
		
		//Data Manipulation
		
		v.add(1, "Dada");
		System.out.println(v);
		
		v.remove(3);
		System.out.println(v);
		
		//Data Updation
		v.set(3, "Shyam");
		System.out.println(v);
		
	}

}
