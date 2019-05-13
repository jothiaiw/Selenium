package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import createLaedPages.PageFactory1;
import design.ProjectMethods;

public class PageFactoryTestCase extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		dataSheetName = "Login";
	}
	
	@Test(dataProvider = "fetchData")
	public void logIn(String userName,String password) {		
		new PageFactory1()
		.enterUserName1(userName)
		.enterPassword1(password)
		.clickLogin1()
		.clickCRM()
		.Lead()
		.createLead()
		.CmpyName()
		.FirstName()
		.Submit()
		.FinalView();
	}

}
