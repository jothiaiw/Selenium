package mergeLeadPages;

import design.ProjectMethods;

public class Homepage_merge_a extends ProjectMethods {
	
	public Lead_merge_b Lead_b() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new Lead_merge_b();
		
		
	}

}
