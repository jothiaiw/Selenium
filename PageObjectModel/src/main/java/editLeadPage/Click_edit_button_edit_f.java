package editLeadPage;

import design.ProjectMethods;

public class Click_edit_button_edit_f extends ProjectMethods{

	public Enter_cmpy_name_edit_g edit_button() {
	//click edit button
	driver.findElementByXPath("//a[text() = 'Edit']").click();
	
	return new Enter_cmpy_name_edit_g();
}
}