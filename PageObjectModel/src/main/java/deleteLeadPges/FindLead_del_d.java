package deleteLeadPges;

import design.ProjectMethods;

public class FindLead_del_d extends ProjectMethods{
	
	public Phpage_del_e findlead_d() {
	driver.findElementByLinkText("Find Leads").click();
	return new Phpage_del_e();

}
}