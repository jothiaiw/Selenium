package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import deleteLeadPges.LoginPage_del_a;
import design.ProjectMethods;

public class TC101_DeleteLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		dataSheetName = "Login";
	}
	
	@Test(dataProvider = "fetchData")
	public void logIn(String userName,String password) throws InterruptedException {	
		new LoginPage_del_a()
		.enterUserName_a(userName)
		.enterPassword_a(password)
		.clickLogin_a()
		.clickCRM_b()
		.Lead_c()
		.findlead_d()
		.click_phone_e()
		.Entry_ph_no_e()
        .click_find_lead_e()
        .delete_del_f();
     //   .checking_g(leadID);
        
}
}