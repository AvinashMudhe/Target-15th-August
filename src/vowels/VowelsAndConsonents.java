package vowels;

public class VowelsAndConsonents {

	public static void main(String[] args) {
		
		//To finds Vowels And Consonants
		String a="Avinashaaaeeeeiiioooee";
		int vowels=0;
		a=a.toLowerCase();
		for(int i=0; i<a.length(); i++) {
			
			
			char ch=a.charAt(i);
			if( ch=='a' || ch=='e'|| ch=='i'|| ch=='o' || ch=='u') {
				vowels++;
			}
		
		}
		System.out.println(vowels);
	}

}
