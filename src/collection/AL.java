package collection;

import java.util.ArrayList;

public class AL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		
		ArrayList al=new ArrayList();
		
		al.add("Avinash");
		al.add("Mudhe");
		al.add("QA Autamation");
		al.add("Pune");
		al.add("FZ-S");
		al.add('A');
		al.add(127000);
		al.add(null);
		al.add("Avinash");
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains("Pune"));
		System.out.println(al.get(0));
		System.out.println(al.indexOf("Avinash"));
		System.out.println(al.lastIndexOf("Avinash"));
		System.out.println(al.remove(3));
			
	}

}
