package com.selbot.pages;

import com.selbot.testng.api.base.Annotations;

public class Phpage extends Annotations{
	

	public Phpage click_phone() {
	//Click phone
	driver.findElementByXPath("//span[text() = 'Phone']").click();
	return this;
	}
	
	public Phpage Entry_ph() {
	//Entry ph no
	driver.findElementByName("phoneCountryCode").clear();
	driver.findElementByXPath("//input[@name = 'phoneNumber']").sendKeys("99");
	return this;
	}
	
	public Create_dup click_find() throws InterruptedException {
	//click find lead
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(2000);
	String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
    System.out.println(leadID);
	//select 1st one
	driver.findElementByXPath("(//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId'])/a").click();
     return new Create_dup();
}

	
}