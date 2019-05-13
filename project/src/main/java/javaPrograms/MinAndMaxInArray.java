package javaPrograms;

public class MinAndMaxInArray {
	public static void main(String[] args) {

		int input[] = {3,2,5,7,1};
		
		int x = input[0];
		int y = input[0];
		
		for (int i = 0;i<input.length; i++)
			
		{
			if (input[i]>x)
			{
				
				x= input[i];
				
			}
			
			else if (input[i]<y)
			
					
				{
		
				y = input[i];
				
				}
			
		}
		
		
		System.out.println("min =" +  y);
		System.out.println("max =" +  x);
		
	}
}

