package duplicateLeadPages;

import design.ProjectMethods;

public class LeadPage_dup_c extends ProjectMethods {

	public FindLead_dup_d Lead_c() {
		driver.findElementByLinkText("Leads").click();
		return new FindLead_dup_d();
	}
	
}
