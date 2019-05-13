package duplicateLeadPages;

import design.ProjectMethods;

public class Phpage_dup_e extends ProjectMethods{
	

	public Phpage_dup_e click_phone_e() {
	//Click phone
	driver.findElementByXPath("//span[text() = 'Phone']").click();
	return this;
	}
	
	public Phpage_dup_e Entry_ph_no_e() {
	//Entry ph no
	driver.findElementByName("phoneCountryCode").clear();
	driver.findElementByXPath("//input[@name = 'phoneNumber']").sendKeys("99");
	return this;
	}
	
	public Create_dup_f click_find_lead_e() throws InterruptedException {
	//click find lead
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(2000);
	String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
    System.out.println(leadID);
	//select 1st one
	driver.findElementByXPath("(//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId'])/a").click();
     return new Create_dup_f();
}

	
}