package week5day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

import main.ProjectMethod;

public class MergeLead extends ProjectMethod{
	
	
	@Test
	public void mLead() throws InterruptedException {
	
	       //click lead
			driver.findElementByLinkText("Leads").click();
			
			//click merge lead
			driver.findElementByLinkText("Merge Leads").click();
			
			
			
			//click from lead
			driver.findElementByXPath("(//img[@alt= 'Lookup'])[1]").click();
			
			//move to new window
			Set<String> allWindows = driver.getWindowHandles();
			List<String> allhandles = new ArrayList<>(allWindows);
			driver.switchTo().window(allhandles.get(1));
		
			//Send 1st name
			driver.findElementByName("firstName").sendKeys("jothi");
			
			//click findlead
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			
			Thread.sleep(3000);
		//	String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
			
			//click the find one
	       driver.findElementByXPath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
	       
	       driver.switchTo().window(allhandles.get(0));
	       
	       
	       
	       
	           //click To lead
	     		driver.findElementByXPath("(//img[@alt= 'Lookup'])[2]").click();
	     		
	     		//move to new window
	     		Set<String> allWindows1 = driver.getWindowHandles();
	     		List<String> allhandles1 = new ArrayList<>(allWindows1);
	     		driver.switchTo().window(allhandles1.get(1));
	     	
	     		//Send 1st name
	     		driver.findElementByName("firstName").sendKeys("jothi");
	     		
	     		//click findlead
	     		driver.findElementByXPath("//button[text()='Find Leads']").click();
	     		
	     		Thread.sleep(1000);
	     	//	String leadID1 = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
	     		
	     		//click the find one
	            driver.findElementByXPath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[2]/a").click();
	            
	            driver.switchTo().window(allhandles1.get(1));
	            
	       
	            
	            //merge both the leads  
	            driver.findElementByClassName("buttonDangerous").click();
	            
	            
	            //alert
	            driver.switchTo().alert().accept();
	            
	            
	            driver.close();

}
	
}
