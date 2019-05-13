package week1day2;

public class StartsWith {

	public static void main(String[] args) {
		String input = new String("Jothi lakshmi");
		
		System.out.println(input.startsWith("jothi"));
		
		System.out.println(input.startsWith("Jothi laksh"));
		
		System.out.println(input.startsWith("Jothilaksh"));
		
		System.out.println(input.startsWith("i", 4));

	}

}
