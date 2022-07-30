package kewords;

		public class SuperClass2 extends SuperClass{
		
		String S="Maharastra";
		
		public void Demo() {
			
			String S= "Karjat";
			
			System.out.println(S);     //This print output as a Karjat
			
			System.out.println(this.S);  //This print output as Maharastra
			
			System.out.println(super.S);	
		}	
	
    public static void main(String[] args) {
	
	SuperClass2 city=new SuperClass2();
	city.Demo();
}

}


