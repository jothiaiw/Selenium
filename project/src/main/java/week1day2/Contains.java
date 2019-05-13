package week1day2;

public class Contains {

	public static void main(String[] args) {
	
		String input = "I can do it";
		
		System.out.println(input.contains("Can do"));
		
		System.out.println(input.contains("can do"));
		
		
		if(input.contains("I can"))
		
			System.out.println("Pass");
		
		else
			
		{
			
			System.out.println("Fail");
		}

	}

}
