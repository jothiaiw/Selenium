package mergeLeadPages;

import design.ProjectMethods;

public class From_lead_merge_d extends ProjectMethods {
	
    public New_window_merge_e New_window_d() {
	driver.findElementByXPath("(//img[@alt= 'Lookup'])[1]").click();
	
	return new New_window_merge_e();
    }
}
