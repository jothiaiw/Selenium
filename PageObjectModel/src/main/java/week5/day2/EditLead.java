package week5.day2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class EditLead extends ProjectSpecificMethod {
	
	@BeforeTest
	public void setData() {
		excelfilename="Editlead";
	}
	
	@Test(dataProvider="fetchData")
	public void delLead(String phoneNumber) throws InterruptedException {
		
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phoneNumber);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		WebElement ele = driver.findElementById("updateLeadForm_firstName");
		ele.clear();
		ele.sendKeys("Babu");
		driver.findElementByClassName("smallSubmit").click();
		
		
		Thread.sleep(2000);
		String text = driver.findElementById("viewLead_firstName_sp").getText();
		if (text.contains("Babu")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
}
}






