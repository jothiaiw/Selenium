package week1day2;

public class ZOccurance {

	public static void main(String[] args) {
		//find the occurance of "a" in Banana
		
		String input = new String("BananA");
		
		int count = 0;
		
		for(int i=0; i<=input.length()-1 ; i++)
			
			if(input.charAt(i)== 'a')
				
			{
				
				count++;
			}
		
		System.out.println(count);

	}

}
