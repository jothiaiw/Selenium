package mergeLeadPages;

import design.ProjectMethods;

public class Merge_lead_merge_c extends ProjectMethods{
	public From_lead_merge_d From_lead_d() {
		
		driver.findElementByLinkText("Merge Leads").click();
		
		return new From_lead_merge_d();
	}

}
