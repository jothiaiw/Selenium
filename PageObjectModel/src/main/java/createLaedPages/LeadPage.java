package createLaedPages;

import design.ProjectMethods;

public class LeadPage extends ProjectMethods {

	public CreateLeadPage Lead() {
		driver.findElementByLinkText("Leads").click();
		return new CreateLeadPage();
	}
	
}
