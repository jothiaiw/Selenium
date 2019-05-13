package week1day2;

public class EndsWith {
	public static void main(String args[]){  
		
		
		String s1="java by javatpoint";  
		System.out.println(s1.endsWith("t"));  
		System.out.println(s1.endsWith("point"));  
		
		
		
		String str = "Welcome to Javatpoint.com";  
        System.out.println(str.endsWith("point"));  
        if(str.endsWith(".com")) {  
            System.out.println("String ends with .com");  
        } else
        	System.out.println("It does not end with .com");
        
        
		}
}
