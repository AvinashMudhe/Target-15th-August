package string;

public class ReverseString2 {

	
	public static void main(String[] args) {
		
		String s="India is my Country";
		
		String t="I am Software Tester";
			
		System.out.println(s.length());
		
		System.out.println(s.charAt(13));
		
		System.out.println(s.equals(t));
		
		System.out.println(s.equalsIgnoreCase(t));
		
		System.out.println(s.concat(t));
		
		System.out.println(s.endsWith("country"));
		
		System.out.println(t.startsWith("Tester"));
		
		System.out.println(t.toUpperCase());
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.trim());
		
		System.out.println(s.compareTo(t));
	String p= "Core@Java";
		System.out.println(p.split("@"));
	}
	}
	