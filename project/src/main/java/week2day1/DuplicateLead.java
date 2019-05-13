package week2day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("Demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
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
		System.out.println(driver.findElementByXPath("(//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId'])/a").getText());
		driver.findElementByXPath("(//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId'])/a").click();
		
		//Create duplicate
		driver.findElementByLinkText("Duplicate Lead").click();
		
		driver.findElementByName("submitButton").click();
		
		System.out.println(driver.findElementById("viewLead_companyName_sp").getText());
	
		System.out.println("Duplicate Lead : Success");
		
		//driver.close();
		

	}

}
