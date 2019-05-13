package week3day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExampleFrLinkedHashMap {

	public static void main(String[] args) {
	Map <String,Integer> input = new LinkedHashMap<>();
		
		input.put("Chocolate", 10);
		input.put("Chocolate", 20);
		input.put("Biscuit", 10);
		input.put("chips", 50);
		
		System.out.println(input);

	}

}
