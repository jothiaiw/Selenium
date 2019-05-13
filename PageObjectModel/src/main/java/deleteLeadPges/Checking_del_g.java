package deleteLeadPges;

import design.ProjectMethods;

public class Checking_del_g extends ProjectMethods {
	
	public Checking_del_g checking_g(String leadID) {
	driver.findElementByLinkText("Find Leads").click();
	driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	String text = driver.findElementByClassName("x-paging-info").getText();
	if (text.equals("No records to display")) {
		System.out.println("Text matched");
	} else {
		System.out.println("Text not matched");
	}

	return new Checking_del_g();
}
}