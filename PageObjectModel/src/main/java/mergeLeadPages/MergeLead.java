package mergeLeadPages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		ChromeDriver driver  = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("Demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Homepage_merge_a
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		
		//Lead_merge_b
		//click lead
		driver.findElementByLinkText("Leads").click();
		
		
		//Merge_lead_merge_c
		//click merge lead
		driver.findElementByLinkText("Merge Leads").click();
		
		
		//From_lead_merge_d
		//click from lead
		driver.findElementByXPath("(//img[@alt= 'Lookup'])[1]").click();
		
		//New_window_merge_e
		//move to new window
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<>(allWindows);
		driver.switchTo().window(allhandles.get(1));
	
		//details_merge_f
		//Send details
		driver.findElementByXPath("//Span[text()='Phone']").click();
		
		driver.findElementByXPath("//input[@name='phoneCountryCode']").clear();
		
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		
		//Findlead_merge_g
		//click findlead
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(3000);

       System.out.println(driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText());
		
       //First_merge_h
		//click the find one
       driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a").click();
       
       driver.switchTo().window(allhandles.get(0));
       
       
     //From_lead_merge_i
       
           //click To lead
     		driver.findElementByXPath("(//img[@alt= 'Lookup'])[2]").click();
     		
     		////New_window_merge_j
     		
     		//move to new window
     		Set<String> allWindows1 = driver.getWindowHandles();
     		List<String> allhandles1 = new ArrayList<>(allWindows1);
     		driver.switchTo().window(allhandles1.get(1));
     		
     		
     		//details_merge_k
     		//Send details
    		driver.findElementByXPath("//Span[text()='Phone']").click();
    		
    		driver.findElementByXPath("//input[@name='phoneCountryCode']").clear();
    		
    		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
    		
    		//Findlead_merge_l
    		
     		//click findlead
     		driver.findElementByXPath("//button[text()='Find Leads']").click();
     		
     		Thread.sleep(1000);
     		
     	   System.out.println(driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a").getText());
     		
     	   //find_merge_m
     		//click the find one
            driver.findElementByXPath("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[2]/a").click();
            
            driver.switchTo().window(allhandles1.get(0));
            
            Thread.sleep(1000);
            
            //merge_merge_n
            //merge both the leads  
            driver.findElementByClassName("buttonDangerous").click();
            Thread.sleep(1000);
            
            //alert_merge_o
            //alert
            driver.switchTo().alert().accept();
            
            
           // driver.close();
		
	
}

}
