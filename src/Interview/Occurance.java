package Interview;

public class Occurance {
	public static void main(String[] args) {
		String s="Avinash";
		s=s.toLowerCase();
		
		for(int i=0; i<s.length(); i++) {
			int count=0;
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}System.out.println(s.charAt(i)+" count "+count);
		}
	}

}
