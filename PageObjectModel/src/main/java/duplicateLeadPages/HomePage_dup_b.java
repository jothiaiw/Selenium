package duplicateLeadPages;

import design.ProjectMethods;

public class HomePage_dup_b extends ProjectMethods{

	public LeadPage_dup_c clickCRM_b() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new LeadPage_dup_c();
	}



}
