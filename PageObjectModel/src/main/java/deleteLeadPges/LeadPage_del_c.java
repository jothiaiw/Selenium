package deleteLeadPges;

import design.ProjectMethods;

public class LeadPage_del_c extends ProjectMethods {

	public FindLead_del_d Lead_c() {
		driver.findElementByLinkText("Leads").click();
		return new FindLead_del_d ();
	}
	
}
