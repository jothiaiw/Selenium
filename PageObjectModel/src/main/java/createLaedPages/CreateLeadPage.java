package createLaedPages;

import design.ProjectMethods;

public class CreateLeadPage extends ProjectMethods  {
	
	public LeaddetailsPage createLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new LeaddetailsPage ();
	}

}
