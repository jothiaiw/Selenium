package week3day2;

//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExampleFrList {

	public static void main(String[] args) {
		List <String> input = new LinkedList<>();
		
		input.add("J1");
		input.add("J2");
		input.add("J3");
		input.add("J4");
		input.add("J5");
		
		System.out.println(input.size());
		
		for(String print : input)
			
		{
		System.out.println(print);
		}
		
		System.out.println(input.get(3));
		
		System.out.println(input.remove(2));
		
		System.out.println(input.get(3));
		
		System.out.println("");
		
		input.add(3, "j9");
		
		
for(String print : input)
			
		{
		System.out.println(print);
		}
System.out.println("");



System.out.println(input.contains("J2"));
		
		input.clear();

		System.out.println(input.isEmpty());
		
	//System.out.println(input.get(2));
		
	

	}

}
