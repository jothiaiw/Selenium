package week3day2;

import java.util.ArrayList;
import java.util.List;

public class OutOf10Remove1st5 {

	public static void main(String[] args) {
		
	List<String> input = new ArrayList<>();
		
		input.add("J1");
		input.add("J2");
		input.add("J3");
		input.add("J4");
		input.add("J5");
		input.add("J6");
		input.add("J7");
		input.add("J8");
		input.add("J9");
		input.add("J10");
		
		
	/*	for(int i=0;i<5;i++) {
			input.remove(0);
		}
		System.out.println(input);*/
		
		
		
		for(int i=0;i<5;i++) {
			input.remove(0);
		}
		
		for (String print : input)
		{
		System.out.println(print);
		
		}

}
	
}
