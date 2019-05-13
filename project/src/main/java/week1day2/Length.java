package week1day2;

public class Length {

	public static void main(String[] args) {


		String input = new String("jothi");	
		System.out.println("Output " + input.length());
		
		
		
		String input1 = new String("jothi lakshmi");	
		System.out.println("Output " + input1.length());
		
		
		
		String s1="javatpoint";  
		String s2="python";  
		System.out.println("string length is: "+s1.length());//10 is the length of javatpoint string  
		System.out.println("string length is: "+s2.length());//6 is the length of python string
	
		
		
		String str = "Javatpoint";  
        if(str.length()>0) {  
            System.out.println("String is not empty and length is: "+str.length());  
        }   
        str = "";  
        if(str.length()==0) {      	   
            System.out.println("String is empty now: "+str.length());  
        }
        
        
        
	}

}
