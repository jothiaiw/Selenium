package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import design.ProjectMethods;
import mergeLeadPages.Login_merge;

public class TC101_MergeLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		dataSheetName = "Login";
	}
	
	@Test(dataProvider = "fetchData")
	public void logIn(String userName,String password) throws InterruptedException {	
		new Login_merge()
		.enterUserName_a(userName)
		.enterPassword_a(password)
		.clickLogin_a()
		.Lead_b()
		.Merge_lead_c()
		.From_lead_d()
		.New_window_d()
		.New_window_e()
		.Send_details_e()
		.Findlead_merge_e()
		.First_merge() 
		.From_lead_f()
		.New_window_g()
		.Send_details_g()
		.Findlead_merge_g()
		.First_merge_g()
		.Merge_h()
		.Alert_i();
}
}