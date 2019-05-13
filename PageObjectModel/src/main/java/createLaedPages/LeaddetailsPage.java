package createLaedPages;

import design.ProjectMethods;

public class LeaddetailsPage extends ProjectMethods {
	
	public LeaddetailsPage CmpyName() {
		driver.findElementById("createLeadForm_companyName").sendKeys("Wipro limited");
		return this;
	}

	
	public LeaddetailsPage FirstName() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Jothilakshmi");
		return this;
	}
	
	
	public LeaddetailsPage lastName() {
		driver.findElementById("createLeadForm_lastName").sendKeys("B");
		return this;
	}
	
	public ViewLeadPage Submit() {
		driver.findElementByClassName("smallSubmit").click();
		return new ViewLeadPage();
	}
}
