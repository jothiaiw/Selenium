package week1day2;

public class ZOddStringInUpper {

	public static void main(String[] args) {
		
	String input = "jothilakshmi";
	
	int count = input.length();
	
	
	for (int i=0; i<=count - 1 ; i++)
	{	
		
		
		String y = input.toUpperCase();
		char x = y.charAt(i);
		
		char z = input.charAt(i);
		
		
		if(i%2 ==0)
			
	
	
			System.out.print(x);  //if I give println, It will give out as one by one
	
		else
			
			System.out.print(z);

	}
	
	}

}
