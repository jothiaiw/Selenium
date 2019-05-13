package com.selbot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selbot.pages.LoginPage;

import com.selbot.testng.api.base.Annotations;

public class TC001_DuplicateLead extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC001_DuplicateLead";
		testcaseDec = "Login, Create duplicate Lead and Verify";
		author = "Sarath";
		category = "smoke";
		excelFileName = "TC001";
	} 

	@Test(dataProvider="fetchData") 
	public void createLead(String uName, String pwd,String companyName, String firstName, String lastName) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd) 
		.clickLogin()
		.clickCRMSFA()
        .clickLeads_dup()
        .clickCreateLead()
        .click_phone() 
		.Entry_ph()
		.click_find()
		.create_f();
	
	}
	
}






