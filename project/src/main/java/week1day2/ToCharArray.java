package week1day2;

public class ToCharArray {

	public static void main(String[] args) {
		{
		String s1="hello";  
		char[] ch=s1.toCharArray();  
		for(int i=0;i<ch.length;i++){  
		System.out.print(ch[i]);                    //print
		
		}}
		
		 System.out.println("------");
		{
	    String s = "Welcome to Javatpoint";  
        char[] ch1 = s.toCharArray();  
        int len = ch1.length;  
        System.out.println("Char Array length: " + len);  
        System.out.println("Char Array elements: ");  
        for (int i = 0; i < len; i++) {  
            System.out.println(ch1[i]);                   //println

	} }

	}
	
}
