package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import design.ProjectMethods;
import duplicateLeadPages.LoginPage_dup_a;

public class TC101_DuplicateLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		dataSheetName = "Login";
	}
	
	@Test(dataProvider = "fetchData")
	public void logIn(String userName,String password) throws InterruptedException {	
		new LoginPage_dup_a()
		.enterUserName_a(userName)
		.enterPassword_a(password)
		.clickLogin_a()
		.clickCRM_b()
		.Lead_c()
		.findlead_d()
		.click_phone_e()
		.Entry_ph_no_e()
        .click_find_lead_e()
        .create_f();
        

        
}
}