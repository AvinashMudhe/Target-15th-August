package kewords;

public class thiss {
	
	//This Keyword: This Keyword is used to access global variable in local method 
	//If global variable and local variable have same with in a class
	
		String S= "Java";
	
	public void subject() {
		
		String S="Automation";
		
		System.out.println(S);        //This print output as a Automation
		
		System.out.println(this.S);   //This print output as a Java
	}
		public static void main(String[] args) {
		
		thiss sub=new thiss();
		
		sub.subject();
}
}