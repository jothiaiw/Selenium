package deleteLeadPges;

import design.ProjectMethods;

public class HomePage_del_b extends ProjectMethods{

	public LeadPage_del_c clickCRM_b() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new LeadPage_del_c();
	}



}
