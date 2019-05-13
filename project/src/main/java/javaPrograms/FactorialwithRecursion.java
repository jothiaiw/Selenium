package javaPrograms;

public class FactorialwithRecursion {

	
	
	static int factorial(int n)
	{
		if(n==0)
         
			return 1;
		
		else 
			
			return(n * factorial(n-1));
	}
	
	public static void main(String[] args) {
	
		 int number = 5, fact = 1 ;
		fact = factorial(number);
		
		System.out.println(fact);
		
	}
}

