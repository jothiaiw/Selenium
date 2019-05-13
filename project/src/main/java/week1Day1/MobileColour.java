package week1Day1;

public class MobileColour {

	public static void main(String[] args) {
		
		MblClrCalling mobile = new MblClrCalling();
		
		mobile.mblclr1();
		
		
		MblClrCalling mobile1 = new MblClrCalling();
		
		String output = mobile1.mblclr2();
		
		System.out.println(output);
		
		
		MblClrCalling mobile2 = new MblClrCalling();
		
		boolean out = mobile2.mblclr3();
		System.out.println(out);
		// or
		System.out.println(mobile2.mblclr3());
		
		
		
	  MblClrCalling mobile3 = new MblClrCalling();
	  int mblclr4 = mobile3.mblclr4();
	  System.out.println(mblclr4);
	  //or
		System.out.println(mobile3.mblclr4());
		
	}

}
