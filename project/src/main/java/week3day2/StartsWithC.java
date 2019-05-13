package week3day2;


import java.util.Set;
import java.util.TreeSet;

public class StartsWithC {

	public static void main(String[] args) {
		
	Set<String> input = new TreeSet<>();
		
		input.add("aJ1");
		input.add("bJ2");
		input.add("cJ3");
		input.add("cJ4");
		input.add("dJ5");
		
		for (String eachin : input) {
			if(eachin.startsWith("c")) {
			
			System.out.println(eachin);
			}
		}

	}

}
