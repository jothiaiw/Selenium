package interview;

import java.util.Arrays;
import java.util.Collections;

public class Max_min {

	public static void main(String[] args) {

		Integer[] inp = {10,2,3,4,5};
		
		int min,max;
		
		min = Collections.min(Arrays.asList(inp));
		max = Collections.max(Arrays.asList(inp));
		

		System.out.println("min = "+ min);
		System.out.println("max = "+ max);
	}

}
