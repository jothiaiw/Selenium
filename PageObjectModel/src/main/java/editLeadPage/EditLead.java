package editLeadPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		
		
		 //Click lead
		driver.findElementByLinkText("Leads").click();
		
		//Find_lead_edit_d
		//Click find lead
		driver.findElementByLinkText("Find Leads").click();
		
		//Click_phone_edit_e
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
		
		//click_edit_button_edit_f
		//click edit button
		driver.findElementByXPath("//a[text() = 'Edit']").click();
		
		
		//Enter_cmpy_name_edit_g
		//enter cmpy name
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("wipro");

		//update it
		driver.findElementByXPath("//input[@name = 'submitButton']").click();	
		System.out.println("Success");
		
		driver.close();
		
		
		
		
		
		
	}

}
