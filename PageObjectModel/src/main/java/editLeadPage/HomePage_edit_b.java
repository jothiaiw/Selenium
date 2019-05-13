package editLeadPage;

import design.ProjectMethods;

public class HomePage_edit_b extends ProjectMethods{

	public LeadPage_edit_c clickCRM() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new LeadPage_edit_c();
	}






}
