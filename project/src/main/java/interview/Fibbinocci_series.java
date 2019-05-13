package interview;

public class Fibbinocci_series {

	public static void main(String[] args) {

		int i=1,j=1,k;
		
		for(int n=1; n<10;n++)
			
		{
			
			k=i+j;
		    
			System.out.println(i);
			
		    i=j;
		    j=k;
		}
		

	}

}
