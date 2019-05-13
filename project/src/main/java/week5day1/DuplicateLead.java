package week5day1;

import org.testng.annotations.Test;

import main.ProjectMethod;

public class DuplicateLead extends ProjectMethod{
	
	@Test

	public void dupLead() throws InterruptedException {
	//Click Lead
			driver.findElementByLinkText("Leads").click();
			
			//Click find lead
			driver.findElementByLinkText("Find Leads").click();
			
			//Click phone
			driver.findElementByXPath("//span[text() = 'Phone']").click();
			
			
			//Entry ph no
			driver.findElementByName("phoneCountryCode").clear();
			driver.findElementByXPath("//input[@name = 'phoneNumber']").sendKeys("99");
			
			//click find lead
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(2000);
			
			//select 1st one
			driver.findElementByXPath("(//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId'])/a").click();
			
			//Create duplicate
			driver.findElementByLinkText("Duplicate Lead").click();
			
			driver.findElementByName("submitButton").click();
			
			System.out.println("Duplicate Lead : Success");
			
			driver.close();
}
	}
