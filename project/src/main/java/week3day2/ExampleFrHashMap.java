package week3day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class ExampleFrHashMap {


	public static void main(String[] args) {
		Map <String,Integer> input = new HashMap<>();
		
		input.put("Chocolate", 10);
		input.put("Chocolate", 20);
		input.put("Biscuit", 10);
		input.put("chips", 50);
		
		System.out.println(input);
		

		System.out.println(input.keySet());

		System.out.println(input.values());
		
		System.out.println(input.containsKey("Chips"));
		System.out.println(input.containsValue(50));
		
		
		System.out.println(input.size());
				
		
		System.out.println(input.get("chips"));
		
		System.out.println(input.entrySet());
		
		
		System.out.println(input.remove("chips"));
		
		System.out.println(input);
		
		System.out.println(input.replace("Chocolate", 20, 100));	
		System.out.println(input);
		
		
		System.out.println("");
		
		for(Entry <String,Integer> print :input.entrySet())
		
		{
			
			System.out.println(print.getKey()+"->"+print.getValue());
					
		
		}
		
		
		
	}

}
