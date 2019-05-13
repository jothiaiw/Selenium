//Base class1

package week3day1;

public class Vehicle extends Vehicle1{
	
	public void changeGear()
	{
		
		System.out.println("done");
	}
	
	
	public void applyBrake()
	{
		
		System.out.println("applied");
	}
	
	
	
	public static void main(String[] args) {

		Sportsbike out =new Sportsbike();
    
    out.changeGear();
    out.headLamp();
    
    
    Scooter out1 = new Scooter(); 
    out1.applyBrake();
    


	}

}
