package week5day1;

import org.testng.annotations.Test;

import main.ProjectMethod;

public class DeleteLead extends ProjectMethod{
	
	@Test

	public void delLead() throws InterruptedException {
	
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
	
	String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();

	
	//select 1st one
	driver.findElementByXPath("(//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId'])/a").click();
	
	
	driver.findElementByLinkText("Delete").click();
	driver.findElementByLinkText("Find Leads").click();
	driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	String text = driver.findElementByClassName("x-paging-info").getText();
	if (text.equals("No records to display")) {
		System.out.println("Text matched");
	} else {
		System.out.println("Text not matched");
	}
	driver.close();
	}

}
