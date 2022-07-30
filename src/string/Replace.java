package string;

public class Replace {

	public static void main(String[] args) {
		
		//replace--> It replace the String character
		
		String s= "Ram";
		
		String t= "DADA";
		
		String u= "MAHABHARAT";
		
		String k= "Papa";
		
		System.out.println(s.replace("m","j"));	
		
		System.out.println(t.replaceAll("D", "B"));
		
		System.out.println(u.replaceAll("A", "M"));

}
}