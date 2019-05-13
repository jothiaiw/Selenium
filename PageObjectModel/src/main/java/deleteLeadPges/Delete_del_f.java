package deleteLeadPges;

import design.ProjectMethods;

public class Delete_del_f extends ProjectMethods {
	
/*	public Checking_del_g delete_del_f() {
	driver.findElementByLinkText("Delete").click();
    return new Checking_del_g();
}*/
	
	public Delete_del_f delete_del_f() {
		driver.findElementByLinkText("Delete").click();
		return this;
	}

}