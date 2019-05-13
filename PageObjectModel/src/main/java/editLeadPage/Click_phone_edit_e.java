package editLeadPage;

import design.ProjectMethods;

public class Click_phone_edit_e extends ProjectMethods{
	
	
	        public Click_phone_edit_e click_ph() {
	        //Click phone
			driver.findElementByXPath("//span[text() = 'Phone']").click();
			return this;
	        }

	        public Click_phone_edit_e ph_no() {
			//Entry ph no
			driver.findElementByName("phoneCountryCode").clear();
			driver.findElementByXPath("//input[@name = 'phoneNumber']").sendKeys("99");
			return this;
	        }
			
			public Click_phone_edit_e find_lead() throws InterruptedException {
			//click find lead
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(2000);
			return this;
	        }
			
			
			public Click_edit_button_edit_f select_first() {
			//select 1st one
			driver.findElementByXPath("(//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId'])/a").click();
			return new Click_edit_button_edit_f();
			
			}
}
