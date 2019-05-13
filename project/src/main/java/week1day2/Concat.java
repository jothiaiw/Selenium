package week1day2;

public class Concat {

	public static void main(String[] args) {
		
		String s1="java string";  
		s1.concat("is immutable");  
		System.out.println(s1);  
		String s3=s1.concat(" is immutable so assign it explicitly");  
		System.out.println(s3); 
		
		
		
		
		String str1 = "Hello";  
        String str2 = "Javatpoint";  
        String str3 = "Reader";  
        // Concatenating Space among strings  
        String str4 = str1.concat(" ").concat(str2).concat(" ").concat(str3);  
        System.out.println(str4);         
        // Concatenating Special Chars        
        String str5 = str1.concat("!!!");  
        System.out.println(str5);         
        String str6 = str1.concat("@").concat(str2);  
        System.out.println(str6);  
	}

}
