package editLeadPage;

import design.ProjectMethods;

public class Find_lead_edit_d extends ProjectMethods{
 
	public Click_phone_edit_e phone_edit_e() {
	
	//Click find lead
	driver.findElementByLinkText("Find Leads").click();
	
	return new Click_phone_edit_e();
}
}