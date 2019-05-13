package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateUsingHashmap {
	public static void main(String[] args) {
	
		String input ="JothIiiii";
		
		String lowerCase = input.toLowerCase();
		
		Map<Character, Integer> mapinput = new HashMap<>();
		
		char[] charinput = lowerCase.toCharArray();
		
		for(char ch : charinput )
			
		{
			if(mapinput.containsKey(ch))
				
			{
				
				 mapinput.put(ch,mapinput.get(ch)+1);
				 
				 
				// System.out.println(( ch +" out " + mapinput.put(ch,mapinput.get(ch)+1)));
			
			}
			
			else
				
				mapinput.put(ch, 1);
			//System.out.println("out:" + ch + mapinput.put(ch, 1));
		}
		
		
		
		Set<Character> output = mapinput.keySet();
		
		for(Character ch1 : output)
		{
			
			if (!Character.isWhitespace(ch1)) {
		
/*				if(mapinput.get(ch1)>1) {
				
			System.out.println(ch1+"--->"+ mapinput.get(ch1));
			
				}*/
				
				
				System.out.println(ch1+"--->"+ mapinput.get(ch1));
			}
		}
		
	}
}

