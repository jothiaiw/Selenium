package week2day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
	
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
		
		//Create lead
		driver.findElementByLinkText("Create Lead").click();
		
		//Give cmpy name
		driver.findElementById("createLeadForm_companyName").sendKeys("Wipro limited");
		
		//Give 1st name
		driver.findElementById("createLeadForm_firstName").sendKeys("Jothilakshmi");
		
		//Give last name
		driver.findElementById("createLeadForm_lastName").sendKeys("B");
		
		//Submit
		driver.findElementByClassName("smallSubmit").click();
		
		System.out.println("Created lead - Success");
		
		driver.close();
		
		
		

	}

}
