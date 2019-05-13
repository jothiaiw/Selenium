package javaPrograms;

public class ArmStrongNumber {
	public static void main(String[] args) {
	
		int  i =150, c=0, x;

		int temp =i ;
		
		while (i>0)
			
		{
		x = i%10;
		
		c = c +(x*x*x);
				
		i =i/10;
		

		
		}
		
if (c == temp)
{
	
	System.out.println("Armstrong number");
	
}

else
	
	System.out.println("Not a armstrong number");
		
	}
}

