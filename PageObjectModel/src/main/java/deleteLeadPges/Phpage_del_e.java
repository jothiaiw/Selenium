package deleteLeadPges;

import design.ProjectMethods;

public class Phpage_del_e extends ProjectMethods{
	

	public Phpage_del_e click_phone_e() {
	//Click phone
	driver.findElementByXPath("//span[text() = 'Phone']").click();
	return this;
	}
	
	public Phpage_del_e Entry_ph_no_e() {
	//Entry ph no
	driver.findElementByName("phoneCountryCode").clear();
	driver.findElementByXPath("//input[@name = 'phoneNumber']").sendKeys("99");
	return this;
	}
	
	public Delete_del_f click_find_lead_e() throws InterruptedException {
	//click find lead
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(2000);
	String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
    System.out.println(leadID);
	//select 1st one
	driver.findElementByXPath("(//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId'])/a").click();
     return new Delete_del_f();
}

	
}