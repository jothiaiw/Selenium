package editLeadPage;

import design.ProjectMethods;

public class Enter_cmpy_name_edit_g extends ProjectMethods {
	
	public Enter_cmpy_name_edit_g cmpy_name() {
	//enter cmpy name
	driver.findElementById("updateLeadForm_companyName").clear();
	driver.findElementById("updateLeadForm_companyName").sendKeys("wipro");
	return this;
	}
	
	public Enter_cmpy_name_edit_g update() {
	//update it
	driver.findElementByXPath("//input[@name = 'submitButton']").click();	
	System.out.println("Success");
	return this;
	}
}
