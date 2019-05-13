package duplicateLeadPages;

import design.ProjectMethods;

public class Create_dup_f extends ProjectMethods{
	
	public Create_dup_f create_f() {
	
	driver.findElementByLinkText("Duplicate Lead").click();
	
	driver.findElementByName("submitButton").click();
	
	System.out.println(driver.findElementById("viewLead_companyName_sp").getText());

	System.out.println("Duplicate Lead : Success");
	
	return new Create_dup_f();
	

	}
}
