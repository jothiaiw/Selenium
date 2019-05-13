package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import design.ProjectMethods;
import editLeadPage.LoginPage_edit_a;

public class TC101_EditLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		dataSheetName = "Login";
	}
	
	@Test(dataProvider = "fetchData")
	public void logIn(String userName,String password) throws InterruptedException {
		
		new LoginPage_edit_a()
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCRM()
		.Lead()
		.phone_edit_e()
		.click_ph()
		.ph_no()
		.find_lead()
		.select_first()
		.edit_button()
		.cmpy_name()
		.update();

}
}