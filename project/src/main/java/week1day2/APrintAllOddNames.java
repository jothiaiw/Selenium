package week1day2;

public class APrintAllOddNames {

	public static void main(String[] args) {
		
		String[] input = new String[5];
		
		input[0] = "jothi1";
		input[1] = "jothi2";
		input[2] = "jothi3";
		input[3] = "jothi4";
		input[4] = "jothi5";
		
		
		
		for (int i = 0; i < 5; i+=2) {
			System.out.println(input[i]);
		}

	}

}
