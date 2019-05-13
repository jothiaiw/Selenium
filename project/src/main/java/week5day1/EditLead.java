package week5day1;

import org.testng.annotations.Test;

import main.ProjectMethod;

public class EditLead extends ProjectMethod {
	
	@Test
	
	public void eLead() throws InterruptedException {
	
	 //Click lead
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
	
	//click edit button
	driver.findElementByXPath("//a[text() = 'Edit']").click();
	
	//enter cmpy name
	driver.findElementById("updateLeadForm_companyName").clear();
	driver.findElementById("updateLeadForm_companyName").sendKeys("wipro");
	
	//update it
	driver.findElementByXPath("//input[@name = 'submitButton']").click();
	
	System.out.println("Success");
	
	driver.close();
	}
}
