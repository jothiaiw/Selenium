package editLeadPage;

import design.ProjectMethods;

public class LeadPage_edit_c extends ProjectMethods {

	public Find_lead_edit_d Lead() {
		driver.findElementByLinkText("Leads").click();
		return new Find_lead_edit_d();
	}
	
}
