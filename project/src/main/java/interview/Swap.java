package interview;

public class Swap {

	public static void main(String[] args) {

		int i=10,j=20 ;
		
		System.out.println("Before swap");
		System.out.println("i = " +i +","+ "j = " + j);
		
		i= i+j;    //i=3;j=2
		
		j= i-j;     //i=3;j=1	
		i= i-j;
		
		System.out.println("After swap");
		System.out.println("i = " +i +"," +"j = " + j);
		
		

	}

}
