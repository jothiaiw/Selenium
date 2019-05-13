package week3day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleFrLinkedHashSet {

	public static void main(String[] args) {
	
		Set <Integer>	input = new LinkedHashSet<>();
		
		 input.add(5);
		 input.add(2);
		 input.add(1);
		 input.add(2);
		 input.add(4);
		 input.add(3);
		 
		 System.out.println(input);
		 
		 Set <Integer>	input1 = new HashSet<>();
		 
		input1.addAll(input);
		 
		 System.out.println(input1);
			
	}

}
