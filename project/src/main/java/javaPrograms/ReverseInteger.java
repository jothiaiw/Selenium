package javaPrograms;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int a=12345,b;
		
		while(a>0)
		{
			
			b = a%10;
			
			System.out.print(b);
			
			a = a/10;
		}
		

	}

}
