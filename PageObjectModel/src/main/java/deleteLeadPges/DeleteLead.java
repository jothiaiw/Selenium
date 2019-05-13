package deleteLeadPges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	//main method
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	
	    //LoginPage_del_a	
		driver.findElementById("username").sendKeys("Demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		//HomePage_del_b
		driver.findElementByLinkText("CRM/SFA").click();
		
		
		//LeadPage_del_c
		 //Click lead
		driver.findElementByLinkText("Leads").click();
		
		//FindLead_del_d
		//Click find lead
		driver.findElementByLinkText("Find Leads").click();
		
		
		//Phpage_del_e
		//Click phone
		driver.findElementByXPath("//span[text() = 'Phone']").click();
		
		
		//Entry ph no
		driver.findElementByName("phoneCountryCode").clear();
		driver.findElementByXPath("//input[@name = 'phoneNumber']").sendKeys("99");
		
		//click find lead
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);

		String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
        System.out.println(leadID);
		
		//select 1st one
		driver.findElementByXPath("(//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId'])/a").click();
		
		
		
		//delete_del_f
		
		driver.findElementByLinkText("Delete").click();
		
		//checking_del_g
		//checking
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		String text = driver.findElementByClassName("x-paging-info").getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		//driver.close();

	}

}
