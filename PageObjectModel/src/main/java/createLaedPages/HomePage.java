package createLaedPages;

import design.ProjectMethods;

public class HomePage extends ProjectMethods{

	public LeadPage clickCRM() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new LeadPage();
	}






}
