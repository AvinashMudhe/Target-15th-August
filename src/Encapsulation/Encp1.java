package Encapsulation;

public class Encp1 {

	private String name="avi";
	private int RollNu=100;
	private  int marks=85;
	
	public void m1(String name,int RollNu,int marks) {
		this.name=name;
		this.RollNu=RollNu;
		this.marks=marks;
		
		System.out.println("Name= "+this.name+" RollNu.= "+ this.RollNu + " Marks="+ this.marks);
		
	}
	public static void main(String[] args) {
		

	}

}
