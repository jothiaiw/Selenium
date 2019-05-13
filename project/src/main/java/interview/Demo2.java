package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
	
		
String s ="Jothiiiilakshmi jothi jothi";

String[] input  = s.split("\\s");

Map<String,Integer> out = new HashMap<>();

for(String output : input)
	
	
{
	if(out.containsKey(output))
	{
		out.put(output, out.get(output)+1);
		
	}
		
		else
			out.put(output, 1);

 
}



Set<String> out1 = out.keySet();

for(String output1 : out1)
{
	
	System.out.println(output1 +"  " + out.get(output1));
}


 }

	
	}


