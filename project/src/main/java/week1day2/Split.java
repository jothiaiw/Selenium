package week1day2;

public class Split {

	public static void main(String[] args) {
	String input = new String("jothi lakshmi b");
		
		String[] s1 = input.split("\\s");
		
		System.out.println("Output");
		for (String w: s1)

		{
		System.out.println(w);
		}
		
		
		
		System.out.println("");
		System.out.println("Output0");
		for (String w: input.split("\\s", 0))
			
		{
			System.out.println(w);
			}
		
		
		
		System.out.println("");
		System.out.println("Output1");
		for (String w: input.split("\\s", 1))
			
		{
			System.out.println(w);
			}
		
		
		
		
		System.out.println("");
		
		System.out.println("Output2");
		for (String w: input.split("\\s", 2))
			
		{
			System.out.println(w);
			}
		
		
		}  
		
	}

