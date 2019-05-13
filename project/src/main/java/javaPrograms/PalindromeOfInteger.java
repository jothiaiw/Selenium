package javaPrograms;

public class PalindromeOfInteger {
	
	public static void main(String[] args) {
		
		int i =12321,j= 0;
		
		int temp = i;
		
		while(i>0)
		{
			j = j*10 ;
			
			j = j + i%10;
			
			i = i/10;
			
		}

		if (temp ==j)

		{
			System.out.println("Palindrome");
			
		}
		
		else
			
			System.out.println("Not a palindrome");
		
		
	}
}

