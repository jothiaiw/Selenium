package week1day2;

public class CharAt {

	public static void main(String[] args) {
		
		String input = new String("jothi lakshmi");	
		System.out.println("Output " + input.charAt(5));

		
		System.out.println("-----------------------");
	
			String name="javatpoint";  
			char ch=name.charAt(4);//returns the char value at the 4th index  
			System.out.println(ch);
			
	
			
		System.out.println("-----------------------");
		
			String str = "Welcome to Javatpoint portal";      
		    int strLength = str.length();      
		    // Fetching first character  
		    System.out.println("Character at 0 index is: "+ str.charAt(0));      
		    // The last Character is present at the string length-1 index  
		    System.out.println("Character at last index is: "+ str.charAt(strLength-1));
		
		
		System.out.println("-----------------------");
		
		String str1 = "Welcome to Javatpoint portal";          
        for (int i=0; i<=str1.length()-1; i++) {  
            if(i%2!=0) {  
                System.out.println("Char at "+i+" place "+str1.charAt(i));
            }  
        } 
		
		System.out.println("-----------------------");
		 
		String str3 = "Welcome to Javatpoint portal";  
        int count = 0;  
        for (int i=0; i<=str3.length()-1; i++) {  
            if(str.charAt(i) == 't') {  
                count++;  
            }  
        }  
        System.out.println("Frequency of t is: "+count); 
        
		System.out.println("-----------------------");
		
		String name1="JOTHI LAKSHMI";  
		char ch1=name1.charAt(13);//returns the char value at the 10th index  
		System.out.println(ch1); 
		
	}

}
