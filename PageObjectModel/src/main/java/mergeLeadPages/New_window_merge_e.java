package mergeLeadPages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import design.ProjectMethods;

public class New_window_merge_e  extends ProjectMethods {
	
    public New_window_merge_e New_window_e() {
    	Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<>(allWindows);
		driver.switchTo().window(allhandles.get(1));
	    return this;
    }
	
	    public New_window_merge_e Send_details_e() {	
        driver.findElementByXPath("//Span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneCountryCode']").clear();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		return this;
	    }
		
		public New_window_merge_e Findlead_merge_e() throws InterruptedException {
        driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
        System.out.println(driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText());
        return this;
		}
        
        public From_lead_merge_f First_merge() {
        driver.findElementByXPath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a").click();
    	Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<>(allWindows);
        driver.switchTo().window(allhandles.get(0));
        return new From_lead_merge_f();
        }
}
