package com.selbot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.selbot.testng.api.base.Annotations;

public class MyHomePage extends Annotations{
	
	public MyHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Leads")  WebElement eleLeads;


	public MyLeadPage clickLeads() {
		click(eleLeads);
		return new MyLeadPage();
	}


	public FindLead clickLeads_dup() {
		click(eleLeads);
		return new FindLead();
	}




}
