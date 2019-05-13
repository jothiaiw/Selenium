package week1day2;

public class ZStartswithC {

	public static void main(String[] args) {
		
		String input = "Chennai Erode Covai Trichy";
		
	   String[] out = input.split("\\s");
	   
	   for (String i: out)
	   {
		   
		   if (i.startsWith("C"))
			   
		   System.out.println(i);

		   
		   
		  // System.out.println(i.startsWith("C")); return boolen out.. So not valid
	}
	}
}
