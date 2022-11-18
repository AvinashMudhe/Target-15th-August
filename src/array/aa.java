package array;

import java.util.Arrays;

public class aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Avinash";
		s=s.toLowerCase();
		
		int count=0;
		
		for(int i=0; i<=s.length()-1;i++) {
			char ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			count++;
		}
		}System.out.println(count);
		
		}	
			
			
	}
	
