package string;

public class Split {

	public static void main(String[] args) {
		
		//split
		
		String s= "India%Is%My%Country";
		
		String[]t=s.split("%");
		
		String t0= t[0];
		String t1=t[1];
		String t2=t[2];
		String t3=t[3];
		
		
		System.out.println(t0);
		
		System.out.println(t3);
		
		System.out.println(t1);
	}

}
