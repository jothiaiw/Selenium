package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import createLaedPages.LoginPage;
import design.ProjectMethods;

public class TC101_Login extends ProjectMethods{

	@BeforeTest
	public void setData() {
		dataSheetName = "Login";
	}
	
	@Test(dataProvider = "fetchData")
	public void logIn(String userName,String password) {		
		new LoginPage()
		//login page
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		
		//HomePage
		.clickCRM()
		
		//CreateLeadPage
		.Lead()
		.createLead()
		
		//CreateLeadPage
		.CmpyName()
		.FirstName()
		.lastName()
		.Submit()
		
		//ViewLeadPage
		.FinalView();
	}
	
}






