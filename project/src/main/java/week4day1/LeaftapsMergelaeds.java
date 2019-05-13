package week4day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsMergelaeds {

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
		
		System.out.println(driver.getTitle());
		
		
		Thread.sleep(2000);
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Merge Leads").click();
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		
		
		Set<String> allWindows = driver.getWindowHandles(); 
        List<String> ls = new ArrayList<>();
        ls.addAll(allWindows);
        
        System.out.println(driver.getTitle());
        driver.switchTo().window(ls.get(1));
        System.out.println(driver.getTitle());
        
        
        driver.findElementByXPath("//div[@class='x-form-element']/input[1]").sendKeys("10351");
        driver.findElementByLinkText("Find Leads").click();
        
        
        
		
		
		

		
		
	}

}
