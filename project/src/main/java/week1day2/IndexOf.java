package week1day2;

public class IndexOf {

	public static void main(String[] args) {
		
		String ip = new String("This is example for Index");
				System.out.println(ip.indexOf("I"));	
				System.out.println(ip.indexOf("i"));
				System.out.println(ip.indexOf("i",4));
				
				System.out.println(ip.indexOf("is"));
				System.out.println(ip.indexOf("Is"));
				System.out.println(ip.indexOf("is", 4));
				System.out.println(ip.indexOf("is", 10));
	}

}
