package reverse;

public class Primee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=7;
		int Count=0;

		for(int i=2; i<7; i++){

		if(a%i==0){
			Count++;
		}
		}
		if(Count==0){

		System.out.println("Prime Num");
		}
		else{
		System.out.println("Not");
		}
		
		
	}

}
