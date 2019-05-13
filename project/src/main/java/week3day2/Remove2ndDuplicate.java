package week3day2;

import java.util.Set;
import java.util.TreeSet;

public class Remove2ndDuplicate {

	public static void main(String[] args) {
		
		Set<String> input = new TreeSet<>();
		
		input.add("J1");
		input.add("J2");
		input.add("J1");
		input.add("J3");
		input.add("J4");
		
		for (String print : input)
		{
		System.out.println(print);
		
		}
		
	/*	input.remove(2);
				
				for (String print : input)
		{
			
			System.out.println(print);
		}*/
		
		
	/*	Set<String> input1 = new TreeSet<>();
		
		input1.addAll(input);
		
		for (String print : input1)
		{
			
			System.out.println(print);
		}
		
*/
	}

}
