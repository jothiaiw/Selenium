package javaPrograms;

import java.util.Arrays;
import java.util.Collections;

public class MinAndMaxWithCollections {
	public static void main(String[] args) {
	
		Integer input[] = {3,6,2,9,0};
		
		int min = (int) Collections.min(Arrays.asList(input));
		int max = (int) Collections.max(Arrays.asList(input));

		System.out.println("min =" +  min);
		System.out.println("max =" +  max);
		
		
	}
}

