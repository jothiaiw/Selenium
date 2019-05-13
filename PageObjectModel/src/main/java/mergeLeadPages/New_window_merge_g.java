package mergeLeadPages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import design.ProjectMethods;

public class New_window_merge_g extends ProjectMethods{
	
	   public New_window_merge_g New_window_g() {
		Set<String> allWindows1 = driver.getWindowHandles();
 		List<String> allhandles1 = new ArrayList<>(allWindows1);
 		driver.switchTo().window(allhandles1.get(1));
	    return this;
        }
	
	    public New_window_merge_g Send_details_g() {	
        driver.findElementByXPath("//Span[text()='Phone']").click();
        driver.findElementByXPath("//input[@name='phoneCountryCode']").clear();
        driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		return this;
	    }
		
		public New_window_merge_g Findlead_merge_g() throws InterruptedException {
        driver.findElementByXPath("//button[text()='Find Leads']").click();
     	Thread.sleep(1000);
     	System.out.println(driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a").getText());
        return this;
		}
        
        public Merge_merge_h First_merge_g() throws InterruptedException {
        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a").click();
    	Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<>(allWindows);
        driver.switchTo().window(allhandles.get(0));
        Thread.sleep(1000);
        return new Merge_merge_h();
        }

}
