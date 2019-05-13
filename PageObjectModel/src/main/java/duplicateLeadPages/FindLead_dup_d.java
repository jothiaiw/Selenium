package duplicateLeadPages;

import design.ProjectMethods;

public class FindLead_dup_d extends ProjectMethods{
	
	public Phpage_dup_e findlead_d() {
	driver.findElementByLinkText("Find Leads").click();
	return new Phpage_dup_e();

}
}