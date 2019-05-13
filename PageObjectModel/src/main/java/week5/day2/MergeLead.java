package week5.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MergeLead extends ProjectSpecificMethod {

	@BeforeTest
	public void setData() {
		excelfilename="merge";
	}

	@Test(dataProvider="fetchData")
	public void mergeLead(String firstName) throws InterruptedException {

		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		Set<String> allWindow = driver.getWindowHandles();
		List<String> listOfWindows = new ArrayList<String>(allWindow);
		driver.switchTo().window(listOfWindows.get(1));
		driver.findElementByName("firstName").sendKeys(firstName);
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(2000);
		WebElement ele =driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		String text = ele.getText();
		ele.click();
		driver.switchTo().window(listOfWindows.get(0));
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		allWindow = driver.getWindowHandles();
		listOfWindows = new ArrayList<String>(allWindow);
		driver.switchTo().window(listOfWindows.get(1));
		driver.findElementByName("firstName").sendKeys(firstName);
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a").click();
		driver.switchTo().window(listOfWindows.get(0));		
		driver.findElementByLinkText("Merge").click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByName("id").sendKeys(text);
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(2000);
		String recordCount = driver.findElementByClassName("x-paging-info").getText();
		if (recordCount.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}
}






