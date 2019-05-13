package javaPrograms;

public class TrianglePattern3 {
	public static void main(String[] args) {
	
		int n = 5;
		
		for(int i = 1; i<=n; i++)
		{

			
			for (int j=n-1; j>=i;j--)
				
			{
			
				System.out.print(" ");
			}
			
		
			for (int k= 1; k<=i; k++)
			{
			System.out.print("*lkh,n");

			}
			
			System.out.println("");
			
		}
	}
}

