package javaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		

		String input = "Jothi";
		
		int s = input.length();
		
	/*	for (int i=s-1 ; i>=0; i-- )
			
		{
			System.out.print(input.charAt(i));
			
		}
		*/

		char[] t =input.toCharArray();
		
for ( int i = s-1; i>=0;i--)
			
		{
		
	System.out.print(t[i]);
			
		}
		

	}

}

