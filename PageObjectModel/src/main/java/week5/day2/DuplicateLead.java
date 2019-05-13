package week5.day2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DuplicateLead extends ProjectSpecificMethod {

	@BeforeTest
	public void setData() {
		excelfilename="DuplicateLead";
	}

	@Test(dataProvider="fetchData")
	public void dupLead(String phoneNumber) throws InterruptedException {
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phoneNumber);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementByName("submitButton").click();
	}
}






