package com.selbot.pages;

import com.selbot.testng.api.base.Annotations;

public class Create_dup extends Annotations{
	
	public Create_dup create_f() {
	
	driver.findElementByLinkText("Duplicate Lead").click();
	
	driver.findElementByName("submitButton").click();
	
	System.out.println(driver.findElementById("viewLead_companyName_sp").getText());

	System.out.println("Duplicate Lead : Success");
	
	return new Create_dup();
	

	}
}
