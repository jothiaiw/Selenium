package javaPrograms;

public class PalindromeforString {
	public static void main(String[] args) {
		
		String input = "AMmMA";
		String y = "";
		
		int x = input.length();
		
		for(int i=x-1 ; i>=0; i--)
			
		{

			y = y + input.charAt(i);
			
		}
		
		
		if (input.equals(y))
			
		{
			
			System.out.println("Palindrome");
		} 
		
		else
			
			System.out.println("Not a palindrome");
		
	}
}

