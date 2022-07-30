package interface1;

public class Implementation implements Bank {
	
	 public void hdfc() {
		
		 System.out.println("Rate of Interest of hdfc bank is 21%");
	 }
	 
	  public void icici() {
		  
		  System.out.println("Rate of Interest of icici bank is 18%");
	  }
	  
	  public void axix() {
		  
		  System.out.println("Rate of Interest of hdfc bank is 14%");
	  }
	  
	  public void BOI() {
		  
		  System.out.println("Rate of Interest of hdfc bank is 11%");
	  }
	
	  public void SBI() {
		  System.out.println("Rate of Interest of hdfc bank is 9.7%");
		  
	  }
	  
	 public void BOM() {
		  
		  System.out.println("Rate of Interest of BOI bank is 12%");
	  }
	public static void main(String[] args) {
		 
		Implementation imp = new Implementation();
		
		imp.axix();
		imp.BOI();
		imp.BOM();
		imp.SBI();
		imp.hdfc();
		imp.icici();
		
	}

}
